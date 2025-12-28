package DSA.Array.Code;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicate_elements {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,4,5,1,3,4,7,5};
        Map<Integer,Integer> map=new LinkedHashMap<>();
        for(int n:arr){

            map.put(n,map.getOrDefault(n,0)+1);
        }
        System.out.println("Original Array");
        for(int n:arr){
            System.out.print(n+" ");
        }
        System.out.println("Duplicate values:-");
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()>1){
                System.out.print( entry.getKey()+" ");
            }
        }

        //java8
        System.out.println("Using Java8");
        Map<Long,Long> map1= Arrays.stream(arr)
                .mapToObj(n->(long)n)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        for(Map.Entry<Long,Long> entry:map1.entrySet()){
            if(entry.getValue()>1){
                System.out.print(entry.getKey()+" ");
            }
        }
    }
}
