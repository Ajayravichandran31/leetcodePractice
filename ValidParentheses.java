import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        String s4 = "([])";

        System.out.println("s1 valid: " + solution.isValid(s1)); 
        System.out.println("s2 valid: " + solution.isValid(s2)); 
        System.out.println("s3 valid: " + solution.isValid(s3)); 
        System.out.println("s4 valid: " + solution.isValid(s4)); 
    }
}

class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }

        return stack.isEmpty();
    }
}