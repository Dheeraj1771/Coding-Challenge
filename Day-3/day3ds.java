// Day 3: Data Structure and Algorithms: LeetCode 21. Merge Two Sorted Lists
public class day3ds {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode t1 = list1;
        ListNode t2 = list2;
        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode;
        while (t1 != null && t2 != null) {
            if (t1.val <= t2.val) {
                temp.next = t1;
                temp = t1;
                t1 = t1.next;
            } else {
                temp.next = t2;
                temp = t2;
                t2 = t2.next;
            }
        }
        if (t1 != null)
            temp.next = t1;
        else if (t2 != null)
            temp.next = t2;

        return dummyNode.next;
    }

    public static void main(String[] args) {
        day3ds obj1 = new day3ds();
        ListNode list1 = obj1.new ListNode(1);
        ListNode list2 = obj1.new ListNode(2);
        list1.next = obj1.new ListNode(3);
        list1.next.next = obj1.new ListNode(5);
        list1.next.next.next = obj1.new ListNode(7);
        list2.next = obj1.new ListNode(4);
        list2.next.next = obj1.new ListNode(6);
        list2.next.next.next = obj1.new ListNode(8);
        ListNode merged = obj1.mergeTwoLists(list1, list2);
        while (merged.next != null) {
            System.out.print(merged.val + "->");
            merged = merged.next;
        }
        System.out.println(merged.val);
    }
}
