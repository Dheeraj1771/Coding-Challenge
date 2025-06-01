// Day 33: Data Structure and Algorithms: LeetCode 199. Binary Tree Right Side View
import java.util.*;

public class day33ds_01 {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }

    }

    public void rightView(TreeNode root, List<Integer> ans, int currDepth) {
        if (root == null)
            return;

        if (currDepth == ans.size())
            ans.add(root.val);
        rightView(root.right, ans, currDepth + 1);
        rightView(root.left, ans, currDepth + 1);
    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        rightView(root, ans, 0);
        return ans;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);

        day33ds_01 obj = new day33ds_01();
        List<Integer> ans = obj.rightSideView(root);
        System.out.println(ans);
    }
}