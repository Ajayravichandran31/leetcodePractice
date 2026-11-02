public class Maximum69Number {
    public int maximum69Number (int num) {
        int temp = num;
        int index = 0;
        int leftmostSixIndex = -1;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit == 6) {
                leftmostSixIndex = index; 
            }
            index++;
            temp /= 10;
        }
        if (leftmostSixIndex != -1) {
            int placeholder = 1;
            for (int i = 0; i < leftmostSixIndex; i++) {
                placeholder *= 10;
            }
            num += 3 * placeholder;
        }
        return num;
    }

    public static void main(String[] args) {
        Maximum69Number solver = new Maximum69Number();
        System.out.println(solver.maximum69Number(9669));
    }
}
