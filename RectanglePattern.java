package Problem_Solving;

import java.util.Scanner;

public class RectanglePattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int n=2*num-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int min=i;
                if(j<min){
                    min=j;
                }
                if(n-i-1<min){
                    min=n-i-1;
                }
                if(n-j-1<min){
                    min=n-j-1;
                }
                System.out.print((num-min)+" ");
                
            }
            System.out.println();
        }
        sc.close();
    }
}
