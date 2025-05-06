// Day 7: Data Structure and Algorithms: LeetCode 61. Rotate List   
public class day7ds {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0)
            return head;
        int len = 1;
        ListNode newH = head, tail = head;

        while (tail.next != null) {
            tail = tail.next;
            len++;
        }
        tail.next = head;

        k %= len;

        for (int i = 0; i < len - k; i++) {
            tail = tail.next;
        }
        newH = tail.next;
        tail.next = null;
        return newH;
    }

    public static void main(String[] args) {
        day7ds obj = new day7ds();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        int k = 2;
        ListNode result = obj.rotateRight(head, k);
        while (result.next != null) {
            System.out.print(result.val + "->");
            result = result.next;
        }
        System.out.println(result.val);
    }
}