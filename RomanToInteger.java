import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    static class Solution {
        public int romanToInt(String s) {
            Map<Character, Integer> map = new HashMap<>();
            map.put('I', 1);
            map.put('V', 5);
            map.put('X', 10);
            map.put('L', 50);
            map.put('C', 100);
            map.put('D', 500);
            map.put('M', 1000);

            int total = 0;
            int length = s.length();

            for (int i = 0; i < length - 1; i++) {
                int currentVal = map.get(s.charAt(i));
                int nextVal = map.get(s.charAt(i + 1));

                if (currentVal < nextVal) {
                    total -= currentVal;
                } else {
                    total += currentVal;
                }
            }

            total += map.get(s.charAt(length - 1));

            return total;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        
        String[] t = {"III", "LVIII", "MCMXCIV"};

        for (String test : t) {
            int result = solution.romanToInt(test);
            System.out.println("Roman: " + test + " -> Integer: " + result);
        }
    }
}