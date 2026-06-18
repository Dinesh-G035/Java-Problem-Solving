package Problem_Solving;

import java.util.Arrays;
import java.util.Scanner;

public class PascalPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            int num=1;
            for(int j=0;j<n;j++){
                arr[j]=num;
                num=num*(i-j)/(j+1);
            }
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
