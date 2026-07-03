package Self_Learning.Stack;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder s = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                stack.push(ch);
            } else {
                char top = stack.pop();
                s.append(top);
            }
        }
        sc.close();
    }
}
