// Day 29: Data Structure and Algorithms: LeetCode 404. Sum of Left Leaves
public class day29ds_01 {
    int sum;

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public void dfs(TreeNode node) {
        if (node.left != null) {
            if (node.left.left == null && node.left.right == null) {
                sum += node.left.val;
            }
            dfs(node.left);
        }
        if (node.right != null)
            dfs(node.right);
    }

    public int sumOfLeftLeaves(TreeNode root) {
        sum = 0;
        dfs(root);
        return sum;
    }

    public static void main(String[] args) {
        day29ds_01 d = new day29ds_01();
        System.out.println(d.sumOfLeftLeaves(
                new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)))));
    }
}