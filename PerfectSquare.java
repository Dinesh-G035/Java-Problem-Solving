package Problem_Solving;
/* 
Input: num = 16
Output: true
Explanation: We return true because 4 * 4 = 16 and 4 is an integer.
*/
import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean found=false;
        for(int i=1;i*i<=n;i++){
            if(i*i==n){
                found=true;
                break;
            }
        }
        System.out.println(found);
        sc.close();
    }
}
