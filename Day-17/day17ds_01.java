// Day 17: Data Structure and Algorithms: LeetCode 55. Min Stack
import java.util.*;

public class day17ds_01 {
    Stack<Integer> s;
    Stack<Integer> min;

    public day17ds_01() {
        s = new Stack<>();
        min = new Stack<>();
    }

    public void push(int val) {
        if (s.isEmpty()) {
            s.push(val);
            min.push(val);
        } else {
            s.push(val);
            min.push(Math.min(val, min.peek()));
        }
    }

    public int pop() {
        if (s.isEmpty())
            return -1;
        s.pop();
        return min.pop();
    }

    public int top() {
        if (s.isEmpty())
            return -1;
        return s.peek();
    }

    public int getMin() {
        if (s.isEmpty())
            return -1;
        return min.peek();
    }

    public static void main(String[] args) {
        day17ds_01 obj = new day17ds_01();
        obj.push(-2);
        obj.push(0);
        obj.push(-3);
        int param_1 = obj.getMin();
        System.out.println(param_1);
        int param_2 = obj.pop();
        System.out.println(param_2);
        int param_3 = obj.top();
        System.out.println(param_3);
        int param_4 = obj.getMin();
        System.out.println(param_4);
    }
}