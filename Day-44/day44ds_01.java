// Day 44: Data Structure and Algorithms: LeetCode 109. Convert Sorted List to Binary Search Tree
public class day44ds_01 {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public TreeNode convertToBST(ListNode start, ListNode end) {
        if (start == end)
            return null;
        ListNode slow = start, fast = start;

        while (fast != end && fast.next != end) {
            slow = slow.next;
            fast = fast.next.next;
        }

        TreeNode head = new TreeNode(slow.val);
        head.left = convertToBST(start, slow);
        head.right = convertToBST(slow.next, end);
        return head;
    }

    public TreeNode sortedListToBST(ListNode head) {
        if (head == null)
            return null;
        return convertToBST(head, null);
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(-10);
        head.next = new ListNode(-3);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(5);
        head.next.next.next.next = new ListNode(9);
        day44ds_01 obj = new day44ds_01();
        System.out.println(obj.sortedListToBST(head).val);
    }
}