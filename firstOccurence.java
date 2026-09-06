public class firstOccurence {
    
    public int strStr(String haystack, String needle) {
        int hLen = haystack.length();
        int nLen = needle.length();
        
        if (nLen > hLen) return -1;
        
        for (int i = 0; i <= hLen - nLen; i++) {
            int j = 0;
            while (j < nLen && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == nLen) {
                return i;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        firstOccurence solution = new firstOccurence();

        String haystack1 = "sadbutsad";
        String needle1 = "sad";
        System.out.println("Test 1 Result: " + solution.strStr(haystack1, needle1)); 

        String haystack2 = "leetcode";
        String needle2 = "leeto";
        System.out.println("Test 2 Result: " + solution.strStr(haystack2, needle2)); 

        String haystack3 = "hello";
        String needle3 = "ll";
        System.out.println("Test 3 Result: " + solution.strStr(haystack3, needle3));
    }
}