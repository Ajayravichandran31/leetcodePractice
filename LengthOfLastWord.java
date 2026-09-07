public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        int length = 0;
        int i = chars.length - 1;

        while (i >= 0 && chars[i] == ' ') {
            i--;
        }

        while (i >= 0 && chars[i] != ' ') {
            length++;
            i--;
        }

        return length;
    }

    public static void main(String[] args) {
        LengthOfLastWord solver = new LengthOfLastWord();

        String test1 = "Hello World";
        String test2 = "   fly me   to   the moon  ";
        String test3 = "luffy is still joyboy";

        System.out.println("Test 1 Result: " + solver.lengthOfLastWord(test1));
        System.out.println("Test 2 Result: " + solver.lengthOfLastWord(test2));
        System.out.println("Test 3 Result: " + solver.lengthOfLastWord(test3));
    }
}