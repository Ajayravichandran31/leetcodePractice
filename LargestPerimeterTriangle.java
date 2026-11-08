class LargestPerimeterTriangle {
    public static void main(String[] args) {
        LargestPerimeterTriangle solution = new LargestPerimeterTriangle();
        int[] nums = {2, 1, 2};
        System.out.println(solution.largestPerimeter(nums));
    }

    public int largestPerimeter(int[] nums) {
        java.util.Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 2; i--) {
            if (nums[i] < nums[i - 1] + nums[i - 2]) {
                return nums[i] + nums[i - 1] + nums[i - 2];
            }
        }
        return 0;
    }
}