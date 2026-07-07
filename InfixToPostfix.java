package Self_Learning.Stack;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {
    public static int prec(char ch){
        if(ch=='^'){
            return 3;
        }
        else if(ch=='*' || ch=='/'){
            return 2;
        }
        else if(ch=='+' || ch=='-'){
            return 1;
        }
        else{
            return -1;
        }
    }
    static boolean isRightAss(char ch){
        return ch=='^';
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        Stack<Character> stack=new Stack<>();
        StringBuilder s=new StringBuilder();
        for(char ch:str.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                s.append(ch);
            }
            else if(ch=='('){
                stack.push(ch);
            }
            else if(ch==')'){
                while(!stack.isEmpty() && stack.peek()!='('){
                    s.append(stack.pop());
                }
                stack.pop();
            }
            else{
                while(!stack.isEmpty() && stack.peek()!='(' && (prec(stack.peek())>prec(ch)||prec(stack.peek())==prec(ch) && !isRightAss(ch))){
                    s.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        while(!stack.isEmpty()){
            s.append(stack.pop());
        }
        System.out.println(s.toString());
        sc.close();
    }
}
