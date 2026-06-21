package Self_Learning;

import java.util.Scanner;

public class BitFlip {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int goal=sc.nextInt();
        num=num^goal;
        int count=0;
        while(num>0){
            if((num&1)==1){
                count++;
            }
            num>>=1;
        }
        System.out.println(count);
        sc.close();
    }
}
