// Day 30: Data Structure and Algorithms: LeetCode 543. Diameter of Binary Tree
public class day30ds_01 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    int maxDepth = 0;

    public int dfs(TreeNode root) {
        if (root == null)
            return 0;

        int leftDepth = dfs(root.left);
        int rightDepth = dfs(root.right);
        maxDepth = Math.max(maxDepth, leftDepth + rightDepth);
        return Math.max(leftDepth, rightDepth) + 1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return maxDepth;
    }

    public static void main(String[] args) {
        day30ds_01 obj = new day30ds_01();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(obj.diameterOfBinaryTree(root));
    }
}