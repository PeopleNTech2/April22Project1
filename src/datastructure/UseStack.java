package datastructure;

import java.util.Stack;

public class UseStack {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(52);
        stack.push(86);
        stack.push(47);
        stack.push(91);

        System.out.println(stack);

        stack.pop();

        System.out.println(stack);

        System.out.println(stack.search(86));
    }
}
