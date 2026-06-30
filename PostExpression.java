package Self_Learning;

import java.util.Scanner;
import java.util.Stack;

public class PostExpression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        Stack<Integer> stack=new Stack<>();
        for(char ch:str.toCharArray()){
            if(Character.isDigit(ch)){
                stack.push(ch-'0');
            }
            else{
                int b=stack.pop();
                int a=stack.pop();
                switch(ch){
                    case '+':
                        stack.push(a+b);
                        break;
                    case '-':
                        stack.push(a-b);
                        break;
                    case '*':
                        stack.push(a*b);
                        break;
                    case '/':
                        stack.push(a/b);
                        break;
                    case '%':
                        stack.push(a%b);
                        break;
                }
            }
        }
        System.out.println(stack.pop());
        sc.close();
    }
}
