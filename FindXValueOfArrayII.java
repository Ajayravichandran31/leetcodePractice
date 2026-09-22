import java.util.Arrays;

class FindXValueOfArrayII {

    static class Node {
        int[] cnt = new int[5];
        int prod = 1;
    }

    private Node[] tree;
    private int n;
    private int modK;

    private Node merge(Node left, Node right) {
        Node res = new Node();
        res.prod = (left.prod * right.prod) % modK;

        for (int i = 0; i < modK; i++) {
            res.cnt[i] = left.cnt[i];
        }

        for (int i = 0; i < modK; i++) {
            if (right.cnt[i] > 0) {
                int newRem = (left.prod * i) % modK;
                res.cnt[newRem] += right.cnt[i];
            }
        }

        return res;
    }

    private void build(int[] nums, int node, int start, int end) {
        if (start == end) {
            int rem = nums[start] % modK;
            tree[node] = new Node();
            tree[node].cnt[rem] = 1;
            tree[node].prod = rem;
            return;
        }
        int mid = (start + end) / 2;
        build(nums, node * 2, start, mid);
        build(nums, node * 2 + 1, mid + 1, end);
        tree[node] = merge(tree[node * 2], tree[node * 2 + 1]);
    }

    private void update(int node, int start, int end, int idx, int val) {
        if (start == end) {
            int rem = val % modK;
            tree[node] = new Node();
            tree[node].cnt[rem] = 1;
            tree[node].prod = rem;
            return;
        }
        int mid = (start + end) / 2;
        if (start <= idx && idx <= mid) {
            update(node * 2, start, mid, idx, val);
        } else {
            update(node * 2 + 1, mid + 1, end, idx, val);
        }
        tree[node] = merge(tree[node * 2], tree[node * 2 + 1]);
    }

    private Node query(int node, int start, int end, int l, int r) {
        if (r < start || end < l) {
            return null;
        }
        if (l <= start && end <= r) {
            return tree[node];
        }
        int mid = (start + end) / 2;
        Node leftResult = query(node * 2, start, mid, l, r);
        Node rightResult = query(node * 2 + 1, mid + 1, end, l, r);

        if (leftResult == null) return rightResult;
        if (rightResult == null) return leftResult;

        return merge(leftResult, rightResult);
    }

    public int[] resultArray(int[] nums, int k, int[][] queries) {
        n = nums.length;
        modK = k;
        tree = new Node[4 * n];

        build(nums, 1, 0, n - 1);

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int idx = queries[i][0];
            int val = queries[i][1];
            int start = queries[i][2];
            int x = queries[i][3];

            update(1, 0, n - 1, idx, val);

            Node resNode = query(1, 0, n - 1, start, n - 1);
            ans[i] = resNode.cnt[x];
        }

        return ans;
    }

    public static void main(String[] args) {
        FindXValueOfArrayII solver = new FindXValueOfArrayII();

        int[] nums = {1, 2, 3, 4};
        int k = 3;
        int[][] queries = {
            {0, 2, 0, 1},
            {2, 1, 1, 2}
        };

        int[] result = solver.resultArray(nums, k, queries);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i == result.length - 1 ? "" : " "));
        }
        System.out.println();
    }
}