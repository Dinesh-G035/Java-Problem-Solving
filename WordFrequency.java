import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] arr=str.split(" ");
        Map<String,Integer> map=new LinkedHashMap<>();
        for(String s:arr){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(String s:map.keySet()){
            System.out.print(s+" "+map.get(s)+" ");
        }
        sc.close();
    }
}
