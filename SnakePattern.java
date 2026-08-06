import java.util.*;
public class SnakePattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        for(int i=0;i<n;i++){
            int temp=num;
            for(int j=1;j<=n;j++){
                if(i%2==0)
                    System.out.print(num+" ");
                else
                    System.out.print((n+temp-j)+" ");
                num++;
            }
            System.out.println();
        }
        sc.close();
    }
}
