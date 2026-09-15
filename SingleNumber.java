public class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        SingleNumber solver = new SingleNumber();
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(solver.singleNumber(nums));
    }
}