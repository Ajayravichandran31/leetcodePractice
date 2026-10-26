public class SpecialArrayI {
    public boolean isArraySpecial(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] % 2 == nums[i + 1] % 2) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        SpecialArrayI solver = new SpecialArrayI();
        int[] test1 = {1};
        int[] test2 = {2, 1, 4};
        int[] test3 = {4, 3, 1, 6};

        System.out.println(solver.isArraySpecial(test1));
        System.out.println(solver.isArraySpecial(test2));
        System.out.println(solver.isArraySpecial(test3));
    }
}
