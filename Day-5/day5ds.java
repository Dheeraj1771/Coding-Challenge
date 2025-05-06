// Day 5: Data Structure and Algorithms: LeetCode 234. Palindrome Linked List
public class day5ds {
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

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public ListNode findMiddle(ListNode head) {
        ListNode hare = head;
        ListNode turtle = head;
        while (hare.next != null && hare.next.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode middle = findMiddle(head);
        ListNode secondhalfStart = reverse(middle.next);
        ListNode firsthalfStart = head;
        while (secondhalfStart != null) {
            if (firsthalfStart.val != secondhalfStart.val) {
                return false;
            }
            firsthalfStart = firsthalfStart.next;
            secondhalfStart = secondhalfStart.next;
        }
        return true;

    }

    public static void main(String[] args) {
        day5ds obj = new day5ds();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);
        System.out.println(obj.isPalindrome(head));
    }
}
