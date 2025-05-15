// Day 16: Data Structure and Algorithms: LeetCode 237. Delete Node in a Linked List
public class day16ds {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public void deleteNode(ListNode node) {
        ListNode currNode = node.next;
        node.val = currNode.val;
        node.next = currNode.next;
    }

    public static void main(String[] args) {
        day16ds obj = new day16ds();
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);
        ListNode node = head.next;
        obj.deleteNode(node);
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + "->");
            current = current.next;
        }
        System.out.println("null");
    }
}