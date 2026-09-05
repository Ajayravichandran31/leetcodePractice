public class LongestCommonPrefix {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] test1 = {"flower", "flow", "flight"};
        System.out.println("Test 1 Output: \"" + solution.longestCommonPrefix(test1) + "\""); 
        String[] test2 = {"dog", "racecar", "car"};
        System.out.println("Test 2 Output: \"" + solution.longestCommonPrefix(test2) + "\""); 
        String[] test3 = {"interspecies", "interstellar", "interstate"};
        System.out.println("Test 3 Output: \"" + solution.longestCommonPrefix(test3) + "\""); 
        String[] test4 = {"alone"};
        System.out.println("Test 4 Output: \"" + solution.longestCommonPrefix(test4) + "\""); 
    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String first = strs[0];

        for (int i = 0; i < first.length(); i++) {
            char c = first.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return first.substring(0, i);
                }
            }
        }

        return first;
    }
}