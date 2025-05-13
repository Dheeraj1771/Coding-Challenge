// Day 14: Data Structure and Algorithms: LeetCode 86. Partition List
public class day14ds {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode partition(ListNode head, int x) {
        ListNode leftDummy = new ListNode(0);
        ListNode rightDummy = new ListNode(0);
        ListNode leftCurr = leftDummy, rightCurr = rightDummy;
        while(head != null) {
            if(head.val < x) {
                leftCurr.next = head;
                leftCurr = leftCurr.next;
            } else {
                rightCurr.next = head;
                rightCurr = rightCurr.next;
            }
            head = head.next;
        }
        leftCurr.next = rightDummy.next;
        rightCurr.next = null;
        return leftDummy.next;
    }
    
    public static void main(String[] args) {
        ListNode head = new ListNode(1);    
        head.next = new ListNode(4);    
        head.next.next = new ListNode(3);    
        head.next.next.next = new ListNode(2);    
        head.next.next.next.next = new ListNode(5);    
        head.next.next.next.next.next = new ListNode(2);    
        int x = 3;
        day14ds obj = new day14ds();
        ListNode result = obj.partition(head, x);
        while(result != null) {
            System.out.print(result.val + "->");
            result = result.next;
        }
        System.out.println("null");
    }
}
