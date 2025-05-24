// Day 25: Data Structure and Algorithms: LeetCode 225. Implement Stack using Queues
import java.util.*;

public class day25ds_01 {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public day25ds_01() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        q1.add(x);
    }

    public int pop() {
        if (q1.isEmpty())
            return -1;
        int size = q1.size();
        for (int i = 0; i < size - 1; i++) {
            q2.add(q1.remove());
        }
        int res = q1.remove();
        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
        return res;
    }

    public int top() {
        if (q1.isEmpty())
            return -1;
        int size = q1.size();
        for (int i = 0; i < size - 1; i++) {
            q2.add(q1.remove());
        }
        int top = q1.remove();
        q2.add(top);
        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;
        return top;
    }

    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }

    public static void main(String[] args) {
        day25ds_01 obj = new day25ds_01();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        System.out.println(obj.pop());
        System.out.println(obj.top());
        System.out.println(obj.empty());
    }
}