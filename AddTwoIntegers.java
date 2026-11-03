public class AddTwoIntegers {
    public int sum(int num1, int num2) {
        while (num2 != 0) {
            int carry = (num1 & num2) << 1;
            num1 = num1 ^ num2;
            num2 = carry;
        }
        return num1;
    }

    public static void main(String[] args) {
        AddTwoIntegers solver = new AddTwoIntegers();
        System.out.println(solver.sum(12, 5));
    }
}
