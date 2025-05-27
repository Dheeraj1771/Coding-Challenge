// Day 27: Data Structure and Algorithms: LeetCode 112. Path Sum
import java.util.*;

public class day27ds_01 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    
        TreeNode(int x) {
            this.val = x;
            this.left = null;
            this.right = null;
        }
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;

        Stack<TreeNode> path = new Stack<>();
        Stack<Integer> pathSum = new Stack<>();

        path.push(root);
        pathSum.push(root.val);

        while (!path.isEmpty()) {
            TreeNode temp = path.pop();
            int tempSum = pathSum.pop();

            if (temp.left == null && temp.right == null && tempSum == targetSum)
                return true;
            if (temp.left != null) {
                path.push(temp.left);
                pathSum.push(temp.left.val + tempSum);
            }
            if (temp.right != null) {
                path.push(temp.right);
                pathSum.push(temp.right.val + tempSum);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        day27ds_01 obj = new day27ds_01();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        System.out.println(obj.hasPathSum(root, 22));
    }
}