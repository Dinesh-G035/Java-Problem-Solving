package Self_Learning;
import java.util.*;
public class FiboonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int num=sc.nextInt();
        int a=0,b=1;
        int sum=0;
        for(int i=2;i<=num;i++){
            System.out.print(a+" ");
            sum=a+b;
            a=b;
            b=sum;
        }
        sc.close();
    }
}
