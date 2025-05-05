// Day 6: Data Structure and Algorithms: LeetCode 203. Remove Linked List Elements
public class day6ds {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        while(curr.next != null) {
            if(curr.next.val == val) {
                curr.next = curr.next.next;
            }
            else {
                curr = curr.next;
            }
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        day6ds obj = new day6ds();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode result = obj.removeElements(head, 3);
        while(result.next != null) {
            System.out.print(result.val + "->");
            result = result.next;
        }
        System.out.print(result.val);
    }
}
