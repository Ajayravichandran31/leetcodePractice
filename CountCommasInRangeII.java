import java.util.Scanner;

public class CountCommasInRangeII {

    public static long countCommas(long n) {
        long totalCommas = 0;
        long base = 1000;
        
        while (n >= base) {
            totalCommas += (n - base + 1);
            
            if (base > 1_000_000_000_000_000L / 1000) {
                break;
            }
            base *= 1000;
        }
        
        return totalCommas;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLong()) {
            long n = scanner.nextLong();
            System.out.println(countCommas(n));
        }
        scanner.close();
    }
}