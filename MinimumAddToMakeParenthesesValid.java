import java.util.Scanner;

public class MinimumAddToMakeParenthesesValid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        
        MinimumAddToMakeParenthesesValid solver = new MinimumAddToMakeParenthesesValid();
        int result = solver.minAddToMakeValid(s);
        
        System.out.println(result);
    }

    public int minAddToMakeValid(String s) {
        int open = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                open++;
            } else {
                if (open > 0) {
                    open--;
                } else {
                    count++;
                }
            }
        }

        return open + count;
    }
}