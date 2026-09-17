import java.util.*;

public class StringMatchingInAnArray {
    public static List<String> stringMatching(String[] words) {
        Arrays.sort(words, (a, b) -> Integer.compare(a.length(), b.length()));
        List<String> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[j].contains(words[i])) {
                    result.add(words[i]);
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] words = {"mass", "as", "hero", "superhero"};
        List<String> ans = stringMatching(words);
        System.out.println(ans);
    }
}