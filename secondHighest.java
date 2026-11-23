public class secondHighest {
    public static int secondHighest(String s) {
        int first = -1;
        int second = -1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                int num = ch - '0';
                if (num > first) {
                    second = first;
                    first = num;
                } else if (num > second && num < first) {
                    second = num;
                }
            }
        }
        return second;
    }

    public static void main(String[] args) {
        String s = "dfa12321afd";
        System.out.println(secondHighest(s));
    }
}