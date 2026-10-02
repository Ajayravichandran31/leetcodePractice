import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        int n = 3;
        List<String> result = generateParenthesis(n);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(res, "", 0, 0, n);
        return res;
    }

    private static void backtrack(List<String> res, String current, int open, int close, int max) {
        int len = 0;
        char[] arr = current.toCharArray();
        for (char c : arr) {
            len++;
        }

        if (len == max * 2) {
            res.add(current);
            return;
        }

        if (open < max) {
            backtrack(res, current + "(", open + 1, close, max);
        }

        if (close < open) {
            backtrack(res, current + ")", open, close + 1, max);
        }
    }
}