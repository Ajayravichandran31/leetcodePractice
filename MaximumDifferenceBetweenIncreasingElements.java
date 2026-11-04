class MaximumDifferenceBetweenIncreasingElements {
    public int maximumDifference(int[] nums) {
        int minVal = nums[0];
        int maxDiff = -1;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > minVal) {
                maxDiff = Math.max(maxDiff, nums[i] - minVal);
            } else {
                minVal = nums[i];
            }
        }
        
        return maxDiff;
    }

    public static void main(String[] args) {
        MaximumDifferenceBetweenIncreasingElements solver = new MaximumDifferenceBetweenIncreasingElements();
        int[] nums = {7, 1, 5, 4};
        System.out.println(solver.maximumDifference(nums));
    }
}