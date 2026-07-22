package Self_Learning;

/*
    s = |***|**
    size=1
    start = [1]
    end   = [7]

    Output:
    [3]
*/

import java.util.Scanner;

public class ItemsInContainers {
    public static int countItem(String str,int start,int end){
        int count=0;
        boolean flag=false;
        int stats=0;
        for(int i=start-1;i<end;i++){
            char ch=str.charAt(i);
            if(ch=='|'){
                if(flag){
                    count+=stats;
                }
                flag=true;
                stats=0;
            }
            else{
                if(flag)stats++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int size=sc.nextInt();
        int[] start=new int[size];
        for(int i=0;i<size;i++){
            start[i]=sc.nextInt();
        }
        int[] end=new int[size];
        for(int i=0;i<size;i++){
            end[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.println(countItem(str, start[i], end[i]));
        }
        sc.close();
    }
}
