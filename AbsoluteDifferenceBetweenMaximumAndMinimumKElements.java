import java.util.*;

public class AbsoluteDifferenceBetweenMaximumAndMinimumKElements {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int minSum = 0;
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            minSum += nums[i];
            maxSum += nums[nums.length - 1 - i];
        }
        return Math.abs(maxSum - minSum);
    }

    public static void main(String[] args) {
        AbsoluteDifferenceBetweenMaximumAndMinimumKElements solver = new AbsoluteDifferenceBetweenMaximumAndMinimumKElements();
        int[] nums = {5, 2, 2, 4};
        int k = 2;
        int result = solver.absDifference(nums, k);
        System.out.println("Result: " + result);
    }
}