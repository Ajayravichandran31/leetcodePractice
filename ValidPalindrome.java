public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String cleaned = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                cleaned += Character.toLowerCase(c);
            }
        }
        
        for (int i = 0; i < cleaned.length(); i++) {
            if (cleaned.charAt(i) != cleaned.charAt(cleaned.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome solver = new ValidPalindrome();
        String testStr = "A man, a plan, a canal: Panama";
        boolean result = solver.isPalindrome(testStr);
        System.out.println(result);
    }
}