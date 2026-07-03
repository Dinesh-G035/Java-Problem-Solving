package Self_Learning.Stack;

import java.util.Scanner;
import java.util.Stack;

class StackMax {
    Stack<Integer> stack;
    Stack<Integer> maxStack;

    StackMax() {
        stack = new Stack<>();
        maxStack = new Stack<>();
    }

    void push(int data) {
        stack.push(data);
        if (maxStack.isEmpty() || data >= maxStack.peek()) {
            maxStack.push(data);
        }
    }

    void pop() {
        if (stack.isEmpty()) {
            return;
        }
        int remove = stack.pop();
        if (!maxStack.isEmpty() && remove == maxStack.peek()) {
            maxStack.pop();
        }
    }

    int top() {
        if (stack.isEmpty()) {
            return -1;
        }
        return stack.peek();
    }

    int getMax() {
        if (maxStack.isEmpty()) {
            return -1;
        }
        return maxStack.peek();
    }
}

public class MaxStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackMax s = new StackMax();
        s.push(sc.nextInt());
        s.push(sc.nextInt());
        s.push(sc.nextInt());
        int max = s.getMax();
        System.out.println("Max Value:" + max);
        s.pop();

        System.out.println("Max value:" + s.getMax());
        System.out.println("Top Element:" + s.top());
        sc.close();
    }
}
