public class NumberOfSetsOfKNonOverlappingLineSegments {
    public static void main(String[] args) {
        NumberOfSetsOfKNonOverlappingLineSegments solver = new NumberOfSetsOfKNonOverlappingLineSegments();
        System.out.println(solver.numberOfSets(4, 2));
    }

    public int numberOfSets(int n, int k) {
        int MOD = 1000000007;
        int N = n + k - 1;
        int R = 2 * k;

        if (N < R) return 0;

        long num = 1;
        long den = 1;

        for (int i = 1; i <= R; i++) {
            num = (num * (N - i + 1)) % MOD;
            den = (den * i) % MOD;
        }

        return (int) ((num * modInverse(den, MOD)) % MOD);
    }

    private long modInverse(long a, int mod) {
        return power(a, mod - 2, mod);
    }

    private long power(long x, long y, int mod) {
        long res = 1;
        x = x % mod;
        while (y > 0) {
            if (y % 2 == 1) res = (res * x) % mod;
            y = y >> 1;
            x = (x * x) % mod;
        }
        return res;
    }
}