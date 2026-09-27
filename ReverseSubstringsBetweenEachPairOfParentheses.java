public class ReverseSubstringsBetweenEachPairOfParentheses {

    public String reverseParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ')') {
                int lastOpen = sb.lastIndexOf("(");
                reverseSubstring(sb, lastOpen + 1, sb.length() - 1);
                sb.deleteCharAt(lastOpen);
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    private void reverseSubstring(StringBuilder sb, int left, int right) {
        while (left < right) {
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        ReverseSubstringsBetweenEachPairOfParentheses solver = new ReverseSubstringsBetweenEachPairOfParentheses();

        // Test Cases
        String test1 = "(abcd)";
        System.out.println("Input: " + test1 + " -> Output: " + solver.reverseParentheses(test1));

        String test2 = "(u(love)i)";
        System.out.println("Input: " + test2 + " -> Output: " + solver.reverseParentheses(test2));

        String test3 = "(ed(et(oc)el)e)";
        System.out.println("Input: " + test3 + " -> Output: " + solver.reverseParentheses(test3));
    }
}