package DSA.Array.Code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SecondHighestFrequency {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,1,4,2,5,4,6,3,4,7,5};

        Map<Integer,Integer> map=new HashMap<>();
        for(Integer n:arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        System.out.println("printing occurrence");
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }

        int first=0,second=0;
        List<Integer> result=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int feq=entry.getValue();

            if(feq>first){
                second=first;
                first=feq;
            }
            else if(feq>second && feq<first){
                second=feq;
            }
        }

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==second){
                result.add(entry.getKey());

            }
        }

        System.out.println("Second High occurrence element:-"+result);
        System.out.println("Second high frequency:-"+second);
    }
}
