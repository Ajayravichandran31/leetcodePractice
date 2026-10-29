public class PerfectNumber {
    public boolean checkPerfectNumber(int num) {
        if (num <= 1) {
            return false;
        }

        int sum = 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum = sum + i;
                if (i * i != num) {
                    sum = sum + (num / i);
                }
            }
        }

        return sum == num;
    }

    public static void main(String[] args) {
        PerfectNumber solution = new PerfectNumber();
        System.out.println(solution.checkPerfectNumber(28));
        System.out.println(solution.checkPerfectNumber(7)); 
    }
}