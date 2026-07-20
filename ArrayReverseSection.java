package problem_solving;
import java.util.*;
public class ArrayReverseSection {
    public static int[] reverse(int[] arr,int slow,int fast){
        while(slow<fast){
            int temp=arr[slow];
            arr[slow]=arr[fast];
            arr[fast]=temp;
            slow++;
            fast--;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Array Size:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Array Elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Reverse position:");
        int pos=sc.nextInt();
        arr=reverse(arr, 0, n-1);
        arr=reverse(arr,0,pos-1);
        arr=reverse(arr,pos,n-1);
        for(int i:arr){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
