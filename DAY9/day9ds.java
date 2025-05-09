// Day 9: Data Structure and Algorithms: LeetCode 1721. Swapping Nodes in a Linked List
public class day9ds {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode swapNodes(ListNode head, int k) {
        ListNode p1 = head, p2 = head, kth = null;
        for(int i=1; i<k; i++) {
            p1 = p1.next;
        }
        kth = p1;
        p1 = p1.next;
        while(p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        int temp = p2.val;
        p2.val = kth.val;
        kth.val = temp;

        return head;
    }
    public static void main(String[] args) {
        day9ds obj = new day9ds();
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        int k = 2;
        ListNode result = obj.swapNodes(head, k);
        while(result != null) {
            System.out.print(result.val + "->");
            result = result.next;
        }
        System.out.println("null");
    }
}


