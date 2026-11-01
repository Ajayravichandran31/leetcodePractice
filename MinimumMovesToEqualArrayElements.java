class MinimumMovesToEqualArrayElements {
    public static void main(String[] args) {
        MinimumMovesToEqualArrayElements solution = new MinimumMovesToEqualArrayElements();
        int[] nums = {1, 2, 3};
        int result = solution.minMoves(nums);
        System.out.println(result);
    }

    public int minMoves(int[] nums) {
        int min = nums[0];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return sum - (min * nums.length);
    }
}