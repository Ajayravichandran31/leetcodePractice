class LongestPalindrome {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            count[c]++;
        }
        
        int length = 0;
        boolean hasOdd = false;
        for (int i = 0; i < count.length; i++) {
            int freq = count[i];
            length += (freq / 2) * 2;
            if (freq % 2 == 1) {
                hasOdd = true;
            }
        }
        
        if (hasOdd && length < s.length()) {
            length += 1;
        }
        
        return length;
    }

    public static void main(String[] args) {
        LongestPalindrome solver = new LongestPalindrome();
        String testStr = "abccccdd";
        System.out.println(solver.longestPalindrome(testStr));
    }
}