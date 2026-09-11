import java.util.HashSet;
import java.util.Set;

public class Unique3DigitEvenNumbers {
    public int totalNumbers(int[] digits) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        int n = digits.length;

        for (int i = 0; i < n; i++) {
            if (digits[i] == 0) continue;

            for (int j = 0; j < n; j++) {
                if (i == j) continue;

                for (int k = 0; k < n; k++) {
                    if (i == k || j == k) continue;

                    if (digits[k] % 2 == 0) {
                        int num = digits[i] * 100 + digits[j] * 10 + digits[k];
                        uniqueNumbers.add(num);
                    }
                }
            }
        }

        return uniqueNumbers.size();
    }

    public static void main(String[] args) {
        Unique3DigitEvenNumbers solver = new Unique3DigitEvenNumbers();
        
        int[] digits = {0, 2, 2};
        int result = solver.totalNumbers(digits);
        
        System.out.println(result);
    }
}