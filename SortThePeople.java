import java.util.Arrays;
import java.util.HashMap;

public class SortThePeople {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        String[] ans = new String[names.length];
        int n = ans.length;
        for (int i = heights.length - 1; i >= 0; i--) {
            ans[n - i - 1] = map.get(heights[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        SortThePeople solver = new SortThePeople();
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};
        String[] result = solver.sortPeople(names, heights);
        System.out.println(Arrays.toString(result));
    }
}