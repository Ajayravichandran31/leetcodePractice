public class MajorityElement {
    public int majorityElement(int[] nums) {
        int count = 0;
        int element = 0;
        for (int num : nums) {
            if (count == 0) {
                element = num;
            }
            if (element == num) {
                count++;
            } else {
                count--;
            }
        }
        return element;
    }

    public static void main(String[] args) {
        MajorityElement solver = new MajorityElement();
        int[] nums = {3, 2, 3};
        int result = solver.majorityElement(nums);
        System.out.println("Majority Element: " + result);
    }
}