import java.util.*;

public class MaximumNumberOfNonOverlappingPalindromeSubstrings {
    public static void main(String[] args) {
        MaximumNumberOfNonOverlappingPalindromeSubstrings solver = new MaximumNumberOfNonOverlappingPalindromeSubstrings();
        
        String s1 = "abaccdbbd";
        int k1 = 3;
        System.out.println(solver.maxPalindromes(s1, k1));

        String s2 = "adbcda";
        int k2 = 2;
        System.out.println(solver.maxPalindromes(s2, k2));
    }

    public int maxPalindromes(String s, int k) {
        int n = s.length();
        int ans = 0;
        int i = 0;

        while (i < n) {
            boolean found = false;
            for (int len = k; len <= k + 1; len++) {
                int l = i;
                int r = i + len - 1;
                if (r < n && isPalindrome(s, l, r)) {
                    ans++;
                    i = r + 1;
                    found = true;
                    break;
                }
            }
            if (!found) {
                i++;
            }
        }

        return ans;
    }

    private boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}