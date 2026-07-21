package Self_Learning;

import java.util.Scanner;

public class ExpandString {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++)
         {
            char ch1=str.charAt(i); 
            if(Character.isAlphabetic(ch1))
            {
                int num=0;
                i++;
                while(i<str.length() && Character.isDigit(str.charAt(i))){
                    num=num*10+(str.charAt(i)-'0');
                    i++;
                }
                i--;
                for(int j=0;j<num;j++){
                    System.out.print(ch1);
                }
            }
         }
         System.out.println();
         sc.close();
    }
    
} 

 