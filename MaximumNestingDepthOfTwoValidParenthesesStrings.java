import java.util.Arrays;

public class MaximumNestingDepthOfTwoValidParenthesesStrings {
    public int[] maxDepthAfterSplit(String seq) {
        int n = seq.length();
        int[] ans = new int[n];
        
        for (int i = 0; i < n; i++) {
            if (seq.charAt(i) == '(') {
                ans[i] = i % 2;
            } else {
                ans[i] = (i - 1) % 2; 
            }
        }
        
        return ans;
    }

    public static void main(String[] args) {
        MaximumNestingDepthOfTwoValidParenthesesStrings solution = new MaximumNestingDepthOfTwoValidParenthesesStrings();
        
        String seq1 = "(()())";
        int[] result1 = solution.maxDepthAfterSplit(seq1);
        System.out.println(Arrays.toString(result1));

        String seq2 = "()(())()";
        int[] result2 = solution.maxDepthAfterSplit(seq2);
        System.out.println(Arrays.toString(result2));
    }
}