import java.util.*;

public class TrackPositionInfiniteGrid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int n=sc.nextInt();
        sc.nextLine();
        String str=sc.nextLine();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            switch(ch){
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'L':
                    x--;
                    break;
                case 'R':
                    x++;
                    break;
                default:
                    break;
            }
        }
        System.out.print(x+" "+y);
        sc.close();
    }
}
