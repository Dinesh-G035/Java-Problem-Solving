package Self_Learning;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSorting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            int index=i;
            for(int j=i+1;j<n;j++){
                if(arr[index]>arr[j]){
                    index=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("After:");
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
