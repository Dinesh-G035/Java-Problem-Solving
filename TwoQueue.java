package JavaDSA;

import java.util.*;
class Stack{
    Queue<Integer> q1;
    Queue<Integer> q2;
    public Stack(){
        this.q1=new LinkedList<>();
        this.q2=new LinkedList<>();
    }
    public void push(int n){
        q2.add(n);
        while(!q1.isEmpty()){
            q2.add(q1.poll());
        }
        Queue<Integer> t=q1;
        q1=q2;
        q2=t;

    }
    public int top(){
        return q1.peek();
    }
    public int pop(){
        return q1.poll();
    }
    public boolean empty(){
        return q1.isEmpty();
    }
}
public class TwoQueue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("Top:"+s.top());
        System.out.println("Pop:"+s.pop());
        System.out.println("IsEmpty:"+s.empty());
        sc.close();
    }
}
