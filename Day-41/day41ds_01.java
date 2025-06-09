// Day 41: Data Structure and Algorithms: LeetCode 450. Delete Node in a BST
public class day41ds_01 {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null)
            return null;
        if (root.val == key)
            return helper(root);
        TreeNode dummy = root;
        while (root != null) {
            if (root.val > key) {
                if (root.left != null && root.left.val == key) {
                    root.left = helper(root.left);
                    break;
                } else
                    root = root.left;
            } else {
                if (root.right != null && root.right.val == key) {
                    root.right = helper(root.right);
                    break;
                } else
                    root = root.right;
            }
        }
        return dummy;
    }

    TreeNode helper(TreeNode root) {
        if (root.left == null)
            return root.right;
        if (root.right == null)
            return root.left;

        TreeNode rightChild = root.right;
        TreeNode lastRight = findLastRight(root.left);
        lastRight.right = rightChild;
        return root.left;
    }

    TreeNode findLastRight(TreeNode root) {
        if (root.right == null)
            return root;
        return findLastRight(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(6);
        root.right.right = new TreeNode(7);
        day41ds_01 obj = new day41ds_01();
        System.out.println(obj.deleteNode(root, 3).val);
    }
}