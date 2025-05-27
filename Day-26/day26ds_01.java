// Day 26: Data Structure and Algorithms: LeetCode 94. Binary Tree Inorder Traversal
import java.util.*;

public class day26ds_01 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    
        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public void inOrder(List<Integer> list, TreeNode root) {
        if (root == null)
            return;

        inOrder(list, root.left);
        list.add(root.val);
        inOrder(list, root.right);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inOrder(list, root);
        return list;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        day26ds_01 obj = new day26ds_01();
        List<Integer> list = obj.inorderTraversal(root);
        System.out.println(list);
    }
}