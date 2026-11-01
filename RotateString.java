import java.util.Scanner;

public class RotateString {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) {
            return false;
        }
        
        String d = s + s;
        return d.contains(goal);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RotateString solution = new RotateString();

        String s = scanner.hasNext() ? scanner.next() : "abcde";
        String goal = scanner.hasNext() ? scanner.next() : "cdeab";

        boolean result = solution.rotateString(s, goal);
        System.out.println(result);
        
        scanner.close();
    }
}