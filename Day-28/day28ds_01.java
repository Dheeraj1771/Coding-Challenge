// Day 28: Data Structure and Algorithms: LeetCode 111. Minimum Depth of Binary Tree
import java.util.*;

public class day28ds_01 {
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
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        int depth = 1;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {
            int size = q.size();
            for(int i=0; i<size; i++) {
                TreeNode node = q.poll();
                if(node.left == null && node.right == null) return depth;
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
            depth++;
        }
        return depth;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        day28ds_01 obj = new day28ds_01();
        System.out.println(obj.minDepth(root));
    }
}