public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        ValidAnagram solution = new ValidAnagram();
        
        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println(solution.isAnagram(s1, t1));

        String s2 = "rat";
        String t2 = "car";
        System.out.println(solution.isAnagram(s2, t2));
    }
}