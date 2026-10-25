import java.util.Arrays;

public class MinimumSwapsToMoveZerosToEnd {
    public int minimumSwaps(int[] nums) {
        int zeroCount = 0;
        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            }
        }
        int nonZeroElement = nums.length - zeroCount;
        int count = 0;
        for (int i = 0; i < nonZeroElement; i++) {
            if (nums[i] == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        MinimumSwapsToMoveZerosToEnd solver = new MinimumSwapsToMoveZerosToEnd();
        
        int[] nums1 = {0, 1, 0, 3, 12};
        System.out.println("Input: " + Arrays.toString(nums1));
        System.out.println("Output: " + solver.minimumSwaps(nums1));
        
        int[] nums2 = {0, 1, 0, 2};
        System.out.println("Input: " + Arrays.toString(nums2));
        System.out.println("Output: " + solver.minimumSwaps(nums2));
        
        int[] nums3 = {1, 2, 0};
        System.out.println("Input: " + Arrays.toString(nums3));
        System.out.println("Output: " + solver.minimumSwaps(nums3));
    }
}
