public class ShuffleString {
    public static String restoreString(String s, int[] indices) {
        int n = s.length();
        char[] result = new char[n];
        for (int i = 0; i < n; i++) {
            int targetIndex = indices[i];
            result[targetIndex] = s.charAt(i);
        }
        String answer = "";
        for (int i = 0; i < n; i++) {
            answer = answer + result[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        System.out.println(restoreString(s, indices));
    }
}