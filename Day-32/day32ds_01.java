// Day 32: Data Structure and Algorithms: LeetCode 102. Binary Tree Level Order Traversal
import java.util.*;

public class day32ds_01 {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        if (root == null)
            return ans;

        while (!q.isEmpty()) {
            int x = q.size();
            List<Integer> list = new ArrayList<>();
            while (x > 0) {
                TreeNode curr = q.poll();
                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
                list.add(curr.val);
                x--;
            }
            ans.add(list);
        }
        return ans;
    }

    public static void main(String[] args) {
        day32ds_01 obj = new day32ds_01();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(obj.levelOrder(root));
    }
}