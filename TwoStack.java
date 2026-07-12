package JavaDSA;

import java.util.Stack;

class MyQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;

    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int n) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        s1.push(n);

        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    public int top() {
        return s1.peek();
    }

    public int Pop() {
        return s1.pop();
    }

    public boolean empty() {
        return s1.isEmpty();
    }
}

public class TwoStack {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();

        q.push(1);
        q.push(2);
        q.push(3);

        System.out.println(q.s1);
        System.out.println("Top:" + q.top());
        System.out.println("Pop:" + q.Pop());
        System.out.println("Empty:" + q.empty());
    }
}