package Self_Learning;

import java.util.Scanner;

public class ReverseBit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=0;
        for(int i=0;i<32;i++){
            res=res<<1 | n&1;
            n>>=1;
        }
        System.out.println(res);
        sc.close();
    }
}
