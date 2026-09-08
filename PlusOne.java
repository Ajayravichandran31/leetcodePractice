import java.util.Arrays;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        PlusOne solution = new PlusOne();

        int[] digits1 = {1, 2, 3};
        System.out.println("Input: " + Arrays.toString(digits1));
        System.out.println("Output: " + Arrays.toString(solution.plusOne(digits1)));
        System.out.println();

        int[] digits2 = {4, 3, 2, 9};
        System.out.println("Input: " + Arrays.toString(digits2));
        System.out.println("Output: " + Arrays.toString(solution.plusOne(digits2)));
        System.out.println();

        int[] digits3 = {9, 9, 9};
        System.out.println("Input: " + Arrays.toString(digits3));
        System.out.println("Output: " + Arrays.toString(solution.plusOne(digits3)));
    }
}