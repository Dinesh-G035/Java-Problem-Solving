package Self_Learning.Set;

/*
input:abcdabc
output:4
maximum substring : abcd
*/

import java.util.HashSet;
import java.util.Scanner;

public class LongestSubStringWithoutDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int left=0,right=0,max=0;
        HashSet<Character> set=new HashSet<>();
        while (right<str.length()) {
            char ch=str.charAt(right);
            if(!set.contains(ch)){
                set.add(ch);
                int len=right-left+1;
                if(len>max){
                    max=len;
                }
                right++;
            }
            else{
                set.remove(str.charAt(left));
                left++;
            }
        }
        System.out.println("Maximum Substring:"+max);
        sc.close();
    }
}
