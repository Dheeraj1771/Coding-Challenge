// Day 20: Data Structure and Algorithms: LeetCode 150. Evaluate Reverse Polish Notation
import java.util.*;
public class day20ds_01 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String ch : tokens) {
            if(isOperator(ch)) {
                int b = stack.pop();
                int a = stack.pop();
                int res = performOperation(a, b, ch);
                stack.push(res);
            } else {
                stack.push(Integer.parseInt(ch));
            }
        }
        return stack.pop();
    }
    boolean isOperator(String ch) {
        return ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/");
    }
    int performOperation(int a, int b, String operation) {
        switch(operation) {
            case "+" : return a + b;
            case "-" : return a - b;
            case "*" : return a * b;
            case "/" : return a / b;
            default : return a;
        }
    }

    public static void main(String[] args) {
        day20ds_01 obj = new day20ds_01();
        String[] tokens = {"2","1","+","3","*"};
        System.out.println(obj.evalRPN(tokens));
    }
}