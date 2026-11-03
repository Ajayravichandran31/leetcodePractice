public class MinimumMovesToEqualArrayElementsIII {
    public int minMoves(int[] nums) {
        int max = nums[0];
        for (int x : nums) {
            if (x > max) {
                max = x;
            }
        }
        
        int moves = 0;
        for (int x : nums) {
            moves += (max - x);
        }
        return moves;
    }

    public static void main(String[] args) {
        MinimumMovesToEqualArrayElementsIII solver = new MinimumMovesToEqualArrayElementsIII();
        int[] nums = {2, 1, 3};
        System.out.println(solver.minMoves(nums));
    }
}
