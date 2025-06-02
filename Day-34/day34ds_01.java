// Day 34: Data Structure and Algorithms: LeetCode 114. Flatten Binary Tree to Linked List
public class day34ds_01 {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    TreeNode prev = null;

    public void flatten(TreeNode root) {
        if (root == null)
            return;

        flatten(root.right);
        flatten(root.left);

        root.right = prev;
        root.left = null;
        prev = root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(6);

        day34ds_01 obj = new day34ds_01();
        obj.flatten(root);
        while (root != null) {
            System.out.print(root.val + "->");
            root = root.right;
        }
        System.out.println("null");
    }
}