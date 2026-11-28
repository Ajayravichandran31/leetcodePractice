public class ReplaceAllDigitsWithCharacters {
    public String replaceDigits(String s) {
        char[] arr = s.toCharArray();
        for (int i = 1; i < arr.length; i += 2) {
            int shift = arr[i] - '0';
            arr[i] = (char) (arr[i - 1] + shift);
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        ReplaceAllDigitsWithCharacters obj = new ReplaceAllDigitsWithCharacters();
        System.out.println(obj.replaceDigits("a1c1e1"));
        System.out.println(obj.replaceDigits("a1b2c3d4e"));
    }
}