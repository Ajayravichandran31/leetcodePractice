public class MaximumNestingDepthOfTheParentheses {
    public int maxDepth(String s) {
        int currentDepth = 0;
        int maxDepth = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == '(') {
                currentDepth++;
                if (currentDepth > maxDepth) {
                    maxDepth = currentDepth;
                }
            } else if (c == ')') {
                currentDepth--;
            }
        }
        
        return maxDepth;
    }

    public static void main(String[] args) {
        MaximumNestingDepthOfTheParentheses solution = new MaximumNestingDepthOfTheParentheses();
        System.out.println(solution.maxDepth("(1+(2*3)+((8)/4))+1"));
        System.out.println(solution.maxDepth("(1)+((2))+(((3)))"));
    }
}