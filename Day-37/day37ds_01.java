// Day 37: Data Structure and Algorithms: LeetCode 103. Binary Tree Zigzag Level Order Traversal
import java.util.*;

public class day37ds_01 {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null)
            return ans;
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        boolean isForward = true;
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> levelArr = new LinkedList<>();

            while (levelSize > 0) {
                TreeNode node = queue.poll();
                if (isForward)
                    levelArr.addLast(node.val);
                else
                    levelArr.addFirst(node.val);

                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);

                levelSize--;
            }
            ans.add(levelArr);
            isForward = !isForward;
        }
        return ans;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        day37ds_01 obj = new day37ds_01();
        List<List<Integer>> ans = obj.zigzagLevelOrder(root);
        System.out.println(ans);
    }
}