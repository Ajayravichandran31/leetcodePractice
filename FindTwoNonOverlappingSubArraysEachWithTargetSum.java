import java.util.Arrays;

public class FindTwoNonOverlappingSubArraysEachWithTargetSum {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int[] minLeft = new int[n];
        Arrays.fill(minLeft, 1000000000);

        int left = 0, sum = 0;
        int ans = 1000000000;
        int currentMin = 1000000000;

        for (int right = 0; right < n; right++) {
            sum += arr[right];

            while (sum > target) {
                sum -= arr[left++];
            }

            if (sum == target) {
                int len = right - left + 1;
                if (left > 0 && minLeft[left - 1] != 1000000000) {
                    ans = Math.min(ans, len + minLeft[left - 1]);
                }
                currentMin = Math.min(currentMin, len);
            }

            minLeft[right] = currentMin;
        }

        return ans >= 1000000000 ? -1 : ans;
    }

    public static void main(String[] args) {
        FindTwoNonOverlappingSubArraysEachWithTargetSum solver = new FindTwoNonOverlappingSubArraysEachWithTargetSum();
        int[] arr = {3, 2, 2, 4, 3};
        int target = 3;
        System.out.println(solver.minSumOfLengths(arr, target));
    }
}