public class MissingNumber {
    public int missingNumber(int[] nums) {
        int xorSum = nums.length;

        for (int i = 0; i < nums.length; i++) {
            xorSum = xorSum ^ i ^ nums[i];
        }

        return xorSum;
    }

    public static void main(String[] args) {
        MissingNumber solver = new MissingNumber();
        int[] nums = {3, 0, 1};
        int result = solver.missingNumber(nums);
        System.out.println(result);
    }
}