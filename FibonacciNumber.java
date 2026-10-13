public class FibonacciNumber {
    public static void main(String[] args) {
        FibonacciNumber solver = new FibonacciNumber();
        int n = 4;
        int result = solver.fib(n);
        System.out.println(result);
    }

    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}