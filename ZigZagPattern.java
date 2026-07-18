package Self_Learning;

import java.util.ArrayList;
import java.util.Scanner;

public class ZigZagPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int row=0,col=0;
        for(int i=0;i<n+m-1;i++){
            ArrayList<Integer> list=new ArrayList<>();
            if(i<m){
                row=0;
                col=i;
            }
            else{
                row=i-m+1;
                col=m-1;
            }
            while(row<n && col>=0){
                list.add(arr[row][col]);
                row++;
                col--;
            }
            if(i%2==0){
                for(int j=list.size()-1;j>=0;j--){
                    System.out.print(list.get(j)+" ");
                }
            }
            else{
                for(int j:list){
                    System.out.print(j+" ");
                }
            }
        }
        sc.close();
    }
}
