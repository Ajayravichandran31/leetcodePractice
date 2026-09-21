import java.util.Arrays;

public class FindXValueOfArrayI {
    public long[] resultArray(int[] nums, int k) {
        long[] result = new long[k];
        long[] dp = new long[k];

        for (int num : nums) {
            long[] nextDp = new long[k];
            int currentMod = num % k;

            nextDp[currentMod]++;

            for (int r = 0; r < k; r++) {
                if (dp[r] > 0) {
                    int nextRem = (int) ((1L * r * currentMod) % k);
                    nextDp[nextRem] += dp[r];
                }
            }

            for (int r = 0; r < k; r++) {
                result[r] += nextDp[r];
            }

            dp = nextDp;
        }

        return result;
    }

    public static void main(String[] args) {
        FindXValueOfArrayI solver = new FindXValueOfArrayI();
        int[] nums = {1, 2, 3, 4, 5};
        int k = 3;
        System.out.println(Arrays.toString(solver.resultArray(nums, k)));
    }
}