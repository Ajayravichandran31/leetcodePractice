class ToLowerCase {
    public String toLowerCase(String s) {
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'A' && ch[i] <= 'Z') {
                ch[i] = (char) (ch[i] + 32);
            }
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        ToLowerCase solution = new ToLowerCase();
        String test = "Hello World!";
        System.out.println(solution.toLowerCase(test));
    }
}