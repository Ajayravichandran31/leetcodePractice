public class AddDigits {
    public int addDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return 1 + (num - 1) % 9;
    }

    public static void main(String[] args) {
        AddDigits solver = new AddDigits();
        System.out.println(solver.addDigits(38));
        System.out.println(solver.addDigits(0));
    }
}