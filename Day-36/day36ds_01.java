// Day 36: Data Structure and Algorithms: LeetCode 129. Sum Root to Leaf Numbers
public class day36ds_01 {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public int sumNumbers(TreeNode root) {
        return SumOfNumbers(root, 0);
    }

    public int SumOfNumbers(TreeNode root, int currSum) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return (currSum * 10) + root.val;

        return SumOfNumbers(root.left, (currSum * 10) + root.val) + SumOfNumbers(root.right, (currSum * 10) + root.val);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        day36ds_01 obj = new day36ds_01();
        System.out.println(obj.sumNumbers(root));
    }
}