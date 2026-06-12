import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        Map<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            int complement=target-arr[i];
            if(map.containsKey(complement)){
                list.add(map.get(complement));
                list.add(i);
            }
            map.put(arr[i],i);
        }
        System.out.println(list);
        sc.close();
    }
}
