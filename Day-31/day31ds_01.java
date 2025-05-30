// Day 31: Data Structure and Algorithms: LeetCode 104. Maximum Depth of Binary Tree
public class day31ds_01 {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public int calMaxDepth(TreeNode root) {
        if (root == null)
            return 0;

        int leftHeight = calMaxDepth(root.left);
        int rightHeight = calMaxDepth(root.right);

        int Height = Math.max(leftHeight, rightHeight) + 1;
        return Height;
    }

    public int maxDepth(TreeNode root) {
        return calMaxDepth(root);
    }

    public static void main(String[] args) {
        day31ds_01 obj = new day31ds_01();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(obj.calMaxDepth(root));
    }
}