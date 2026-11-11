import java.util.Scanner;

class RangeAdditionII {
    public int maxCount(int m, int n, int[][] ops) {
        int minRow = m;
        int minCol = n;
        
        for (int i = 0; i < ops.length; i++) {
            if (ops[i][0] < minRow) {
                minRow = ops[i][0];
            }
            if (ops[i][1] < minCol) {
                minCol = ops[i][1];
            }
        }
        
        return minRow * minCol;
    }

    public static void main(String[] args) {
        RangeAdditionII solution = new RangeAdditionII();
        Scanner scanner = new Scanner(System.in);
        
        int m = 3;
        int n = 3;
        int[][] ops = {{2, 2}, {3, 3}};
        
        int result = solution.maxCount(m, n, ops);
        System.out.println(result);
        
        scanner.close();
    }
}