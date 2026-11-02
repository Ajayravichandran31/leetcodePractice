public class MinimumMovesToEqualArrayElementsII {
    public int minMoves2(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) { 
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        
        int middle = nums[nums.length / 2];
        int total = 0;
        
        for (int i = 0; i < nums.length; i++) {
            int diff = nums[i] - middle;
            if (diff < 0) {
                total = total - diff;
            } else {
                total = total + diff;
            }
        }
        
        return total;
    }

    public static void main(String[] args) {
        MinimumMovesToEqualArrayElementsII solver = new MinimumMovesToEqualArrayElementsII();
        int[] nums = {1, 2, 10};
        System.out.println(solver.minMoves2(nums));
    }
}
