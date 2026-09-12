import java.util.*;

public class MaximumScoreOfNonOverlappingIntervals {
    static class State {
        long score;
        List<Integer> indices;

        State(long score, List<Integer> indices) {
            this.score = score;
            this.indices = indices;
        }
    }

    public int[] maximumWeight(List<List<Integer>> intervals) {
        int n = intervals.size();
        int[][] sorted = new int[n][4];
        for (int i = 0; i < n; i++) {
            sorted[i][0] = intervals.get(i).get(0);
            sorted[i][1] = intervals.get(i).get(1);
            sorted[i][2] = intervals.get(i).get(2);
            sorted[i][3] = i;
        }

        Arrays.sort(sorted, (a, b) -> Integer.compare(a[1], b[1]));

        State[][] dp = new State[n + 1][5];
        for (int i = 0; i <= n; i++) {
            for (int k = 0; k <= 4; k++) {
                dp[i][k] = new State(0, Collections.emptyList());
            }
        }

        for (int i = 1; i <= n; i++) {
            int l = sorted[i - 1][0];
            int w = sorted[i - 1][2];
            int idx = sorted[i - 1][3];

            int prev = -1;
            int low = 0, high = i - 2;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (sorted[mid][1] < l) {
                    prev = mid;
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            for (int k = 1; k <= 4; k++) {
                State best = dp[i - 1][k];
                State prevChoice = (prev != -1) ? dp[prev + 1][k - 1] : new State(0, Collections.emptyList());
                long newScore = w + prevChoice.score;

                List<Integer> newList = new ArrayList<>(prevChoice.indices);
                newList.add(idx);
                Collections.sort(newList);

                if (newScore > best.score) {
                    best = new State(newScore, newList);
                } else if (newScore == best.score && newScore > 0) {
                    if (best.indices.isEmpty() || isLexicographicallySmaller(newList, best.indices)) {
                        best = new State(newScore, newList);
                    }
                }

                dp[i][k] = best;
            }
        }

        State result = dp[n][0];
        for (int k = 1; k <= 4; k++) {
            if (dp[n][k].score > result.score) {
                result = dp[n][k];
            } else if (dp[n][k].score == result.score && dp[n][k].score > 0) {
                if (isLexicographicallySmaller(dp[n][k].indices, result.indices)) {
                    result = dp[n][k];
                }
            }
        }

        int[] ans = new int[result.indices.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = result.indices.get(i);
        }
        return ans;
    }

    private boolean isLexicographicallySmaller(List<Integer> a, List<Integer> b) {
        int minLen = Math.min(a.size(), b.size());
        for (int i = 0; i < minLen; i++) {
            if (!a.get(i).equals(b.get(i))) {
                return a.get(i) < b.get(i);
            }
        }
        return a.size() < b.size();
    }

    public static void main(String[] args) {
        MaximumScoreOfNonOverlappingIntervals solver = new MaximumScoreOfNonOverlappingIntervals();
        List<List<Integer>> intervals = Arrays.asList(
            Arrays.asList(1, 3, 2),
            Arrays.asList(4, 5, 2),
            Arrays.asList(1, 5, 5),
            Arrays.asList(6, 9, 3),
            Arrays.asList(6, 7, 1),
            Arrays.asList(8, 9, 1)
        );
        int[] result = solver.maximumWeight(intervals);
        System.out.println(Arrays.toString(result));
    }
}