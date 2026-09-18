import java.util.*;

public class MaximumNumberOfNonOverlappingSubstrings {
    public static List<String> maxNumOfSubstrings(String s) {
        int n = s.length();
        int[] first = new int[26];
        int[] last = new int[26];
        Arrays.fill(first, -1);
        
        for (int i = 0; i < n; i++) {
            int c = s.charAt(i) - 'a';
            if (first[c] == -1) first[c] = i;
            last[c] = i;
        }

        List<String> res = new ArrayList<>();
        int prevEnd = -1;

        for (int i = 0; i < n; i++) {
            if (i == first[s.charAt(i) - 'a']) {
                int right = checkSubstring(s, i, first, last);
                if (right != -1) {
                    if (i > prevEnd) {
                        res.add("");
                    }
                    res.set(res.size() - 1, s.substring(i, right + 1));
                    prevEnd = right;
                }
            }
        }

        return res;
    }

    private static int checkSubstring(String s, int start, int[] first, int[] last) {
        int right = last[s.charAt(start) - 'a'];
        for (int i = start; i <= right; i++) {
            int c = s.charAt(i) - 'a';
            if (first[c] < start) return -1;
            right = Math.max(right, last[c]);
        }
        return right;
    }

    public static void main(String[] args) {
        String s1 = "adefaddaccc";
        System.out.println("Result 1: " + maxNumOfSubstrings(s1));

        String s2 = "abbaccd";
        System.out.println("Result 2: " + maxNumOfSubstrings(s2));
    }
}