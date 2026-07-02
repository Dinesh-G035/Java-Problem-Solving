package Self_Learning.Stack;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public static boolean Valid(String s){
        if(s==null){
            return false;
        }
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='('){
                stack.push(')');
            }
            else if(ch=='['){
                stack.push(']');
            }
            else if(ch=='{'){
                stack.push('}');
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.pop();
                if(ch!=top){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        boolean isValid=Valid(str);
        System.out.println(isValid);
        sc.close();
    }
}
