// Day 40: Data Structure and Algorithms: LeetCode 235. Lowest Common Ancestor of a Binary Search Tree
public class day40ds_01 {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            if (p.val > root.val && q.val > root.val)
                root = root.right;
            else if (p.val < root.val && q.val < root.val)
                root = root.left;
            else
                return root;
        }
        return null;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        day40ds_01 obj = new day40ds_01();
        System.out.println(obj.lowestCommonAncestor(root, root.left, root.right).val);
    }
}