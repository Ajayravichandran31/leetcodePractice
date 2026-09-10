import java.util.LinkedList;
import java.util.Queue;

class CountNodesEqualToAverageOfSubtree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private int matchingNodes = 0;

    public int averageOfSubtree(TreeNode root) {
        dfs(root);
        return matchingNodes;
    }

    private int[] dfs(TreeNode node) {
        if (node == null) {
            return new int[]{0, 0};
        }

        int[] left = dfs(node.left);
        int[] right = dfs(node.right);

        int totalSum = node.val + left[0] + right[0];
        int totalCount = 1 + left[1] + right[1];

        if (totalSum / totalCount == node.val) {
            matchingNodes++;
        }

        return new int[]{totalSum, totalCount};
    }

    private static TreeNode buildTree(Integer[] arr) {
        if (arr == null || arr.length == 0 || arr[0] == null) {
            return null;
        }

        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (!queue.isEmpty() && i < arr.length) {
            TreeNode curr = queue.poll();

            if (i < arr.length && arr[i] != null) {
                curr.left = new TreeNode(arr[i]);
                queue.add(curr.left);
            }
            i++;

            if (i < arr.length && arr[i] != null) {
                curr.right = new TreeNode(arr[i]);
                queue.add(curr.right);
            }
            i++;
        }

        return root;
    }

    public static void main(String[] args) {
        CountNodesEqualToAverageOfSubtree solver = new CountNodesEqualToAverageOfSubtree();

        Integer[] treeArray1 = {4, 8, 5, 0, 1, null, 6};
        TreeNode root1 = buildTree(treeArray1);
        System.out.println("Output 1: " + solver.averageOfSubtree(root1));

        CountNodesEqualToAverageOfSubtree solver2 = new CountNodesEqualToAverageOfSubtree();
        Integer[] treeArray2 = {1};
        TreeNode root2 = buildTree(treeArray2);
        System.out.println("Output 2: " + solver2.averageOfSubtree(root2));
    }
}