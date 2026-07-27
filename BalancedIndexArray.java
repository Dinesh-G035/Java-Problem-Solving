import java.util.*;

public class BalancedIndexArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean found=false;
        int value=0;
        for(int i=0;i<n-2;i++){
            value+=arr[i];
            int sum=0;
            for(int j=i+2;j<n;j++){
                sum+=arr[j];
            }
            if(value==sum){
                found=true;
                System.out.println(i+1);
                break;
            }
        }
        if(!found){
            System.out.println("-1");
        }
        sc.close();
    }
}
