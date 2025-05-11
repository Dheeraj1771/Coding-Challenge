// Day 12: Data Structure and Algorithms: LeetCode 2807. Insert Greatest Common Divisors in Linked List
public class day12ds {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }   

    public int gcd(int c, int d) {
        while(c > 0 && d > 0) {
            if(c > d) c %= d;
            else d %= c;
        }
        if(c == 0) return d;
        return c;
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode a = head, b = head.next;
        while(b != null) {
            int g = gcd(a.val, b.val);
            ListNode G = new ListNode(g);
            a.next = G;
            G.next = b;
            a = b;
            b = b.next;
        }
        return head;
    }
    public static void main(String[] args) {
        day12ds sol = new day12ds();
        ListNode head = new ListNode(18, new ListNode(6, new ListNode(10, new ListNode(3))));
        ListNode result = sol.insertGreatestCommonDivisors(head);
        while(result != null) {
            System.out.print(result.val + "->");
            result = result.next;
        }
        System.out.println("null");
    }
}


