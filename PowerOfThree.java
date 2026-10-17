class PowerOfThree {
    public static void main(String[] args) {
        PowerOfThree solution = new PowerOfThree();
        System.out.println(solution.isPowerOfThree(27));
        System.out.println(solution.isPowerOfThree(0));
        System.out.println(solution.isPowerOfThree(9));
    }

    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 3 == 0) {
            n = n / 3;
        }
        return n == 1;
    }
}