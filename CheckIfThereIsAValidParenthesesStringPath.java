public class CheckIfThereIsAValidParenthesesStringPath {
    Boolean[][][] memo;

    public boolean hasValidPath(char[][] grid) {
        int m = grid.length, n = grid[0].length;

        if ((m + n - 1) % 2 != 0) {
            return false;
        }

        memo = new Boolean[m][n][(m + n) / 2 + 1];
        return dfs(grid, 0, 0, 0);
    }

    private boolean dfs(char[][] grid, int r, int c, int open) {
        int m = grid.length, n = grid[0].length;

        if (grid[r][c] == '(') {
            open++;
        } else {
            open--;
        }

        if (open < 0 || open > (m + n - 1) / 2) {
            return false;
        }

        if (r == m - 1 && c == n - 1) {
            return open == 0;
        }

        if (memo[r][c][open] != null) {
            return memo[r][c][open];
        }

        boolean res = false;
        if (r + 1 < m) {
            res |= dfs(grid, r + 1, c, open);
        }
        if (c + 1 < n) {
            res |= dfs(grid, c + 1, c, open);
        }

        return memo[r][c][open] = res;
    }

    public static void main(String[] args) {
        CheckIfThereIsAValidParenthesesStringPath solver = new CheckIfThereIsAValidParenthesesStringPath();

        char[][] grid1 = {
            {'(', '(', '('},
            {')', '(', ')'},
            {'(', '(', ')'},
            {'(', '(', ')'}
        };
        System.out.println(solver.hasValidPath(grid1));

        char[][] grid2 = {
            {')', ')'},
            {'(', '('}
        };
        System.out.println(solver.hasValidPath(grid2));
    }
}