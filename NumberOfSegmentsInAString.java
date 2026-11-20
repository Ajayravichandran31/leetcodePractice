public class NumberOfSegmentsInAString {
    public int countSegments(String s) {
        int spaces = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                spaces = spaces + 1;
            }
        }
        return spaces + 1;
    }

    public static void main(String[] args) {
        NumberOfSegmentsInAString solver = new NumberOfSegmentsInAString();
        System.out.println(solver.countSegments("Hello, my name is John"));
        System.out.println(solver.countSegments(""));
    }
}