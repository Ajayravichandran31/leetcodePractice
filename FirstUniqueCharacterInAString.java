class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        int[] count = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            count[ch - 'a']++;
        }
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (count[ch - 'a'] == 1) {
                return i;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        FirstUniqueCharacterInAString solver = new FirstUniqueCharacterInAString();
        
        String test1 = "leetcode";
        String test2 = "loveleetcode";
        String test3 = "aabb";
        
        System.path: System.out.println("Test 1 (\"" + test1 + "\"): " + solver.firstUniqChar(test1));
        System.out.println("Test 2 (\"" + test2 + "\"): " + solver.firstUniqChar(test2));
        System.out.println("Test 3 (\"" + test3 + "\"): " + solver.firstUniqChar(test3));
    }
}