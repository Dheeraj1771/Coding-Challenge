// Day 43: Data Structure and Algorithms: LeetCode 230. Kth Smallest Element in a BST
public class day43ds_01 {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    int cnt = 0;
    int ans = -1;

    public int kthSmallest(TreeNode root, int k) {
        inOrder(root, k);
        return ans;
    }

    public void inOrder(TreeNode root, int k) {
        if (root == null)
            return;

        inOrder(root.left, k);

        cnt++;
        if (cnt == k) {
            ans = root.val;
            return;
        }

        inOrder(root.right, k);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        day43ds_01 obj = new day43ds_01();
        System.out.println(obj.kthSmallest(root, 1));
    }
}
