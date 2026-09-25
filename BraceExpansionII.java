import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
class BraceExpansionII {
    public List<String> braceExpansionII(String expression) {
        Set<String> set = parse(expression);
        List<String> list = new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }

    private Set<String> parse(String expr) {
        Set<String> res = new HashSet<>();
        List<Set<String>> groups = new ArrayList<>();
        Set<String> curGroup = new HashSet<>(Arrays.asList(""));

        int i = 0;
        while (i < expr.length()) {
            char ch = expr.charAt(i);

            if (ch == '{') {
                int count = 1, start = ++i;
                while (count > 0) {
                    if (expr.charAt(i) == '{') {
                        count++;
                    } else if (expr.charAt(i) == '}') {
                        count--;
                    }
                    i++;
                }
                Set<String> subRes = parse(expr.substring(start, i - 1));
                curGroup = combine(curGroup, subRes);
            } else if (ch == ',') {
                groups.add(curGroup);
                curGroup = new HashSet<>(Arrays.asList(""));
                i++;
            } else {
                Set<String> single = new HashSet<>(Arrays.asList("" + ch));
                curGroup = combine(curGroup, single);
                i++;
            }
        }

        groups.add(curGroup);
        for (Set<String> g : groups) {
            res.addAll(g);
        }

        return res;
    }

    private Set<String> combine(Set<String> s1, Set<String> s2) {
        Set<String> res = new HashSet<>();
        for (String str1 : s1) {
            for (String str2 : s2) {
                res.add(str1 + str2);
            }
        }
        return res;
    }
}