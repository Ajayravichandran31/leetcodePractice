import java.util.Scanner;

public class ValidParenthesisString {
    public boolean checkValidString(String s) {
        int low = 0;
        int high = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                low++;
                high++;
            } else if (c == ')') {
                low--;
                high--;
            } else {
                low--;
                high++;
            }

            if (high < 0) {
                return false;
            }

            if (low < 0) {
                low = 0;
            }
        }

        return low == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ValidParenthesisString vps = new ValidParenthesisString();
        boolean result = vps.checkValidString(s);
        System.out.println(result);
    }
}