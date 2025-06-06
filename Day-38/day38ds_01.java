// Day 38: Data Structure and Algorithms: LeetCode 700. Search in a Binary Search Tree
public class day38ds_01 {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val)
            return root;
        if (root.val > val)
            return searchBST(root.left, val);
        else
            return searchBST(root.right, val);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        int val = 2;
        day38ds_01 obj = new day38ds_01();
        System.out.println(obj.searchBST(root, val).val);
    }
}