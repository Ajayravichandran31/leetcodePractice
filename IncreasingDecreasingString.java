public class IncreasingDecreasingString {
    public static String sortString(String s) {
        int[] count = new int[26];
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            count[c - 'a'] = count[c - 'a'] + 1;
        }

        char[] res = new char[n];
        int idx = 0;

        while (idx < n) {
            for (int i = 0; i < 26; i++) {
                if (count[i] > 0) {
                    res[idx] = (char) (i + 'a');
                    idx++;
                    count[i] = count[i] - 1;
                }
            }

            for (int i = 25; i >= 0; i--) {
                if (count[i] > 0) {
                    res[idx] = (char) (i + 'a');
                    idx++;
                    count[i] = count[i] - 1;
                }
            }
        }

        return new String(res);
    }

    public static void main(String[] args) {
        String s1 = "aaaabbbbcccc";
        System.out.println(sortString(s1));

        String s2 = "rat";
        System.out.println(sortString(s2));
    }
}