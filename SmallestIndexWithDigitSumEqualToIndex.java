public class SmallestIndexWithDigitSumEqualToIndex {

    public static int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int digitSum = 0;
            int currentNum = nums[i];

            if (currentNum == 0) {
                digitSum = 0;
            } else {
                while (currentNum > 0) {
                    digitSum = digitSum + currentNum % 10;
                    currentNum = currentNum / 10;
                }
            }

            if (digitSum == i) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 2};
        System.out.println("Output for nums1: " + smallestIndex(nums1)); 

        int[] nums2 = {1, 10, 11};
        System.out.println("Output for nums2: " + smallestIndex(nums2)); 

        int[] nums3 = {1, 2, 3};
        System.out.println("Output for nums3: " + smallestIndex(nums3));
    }
}