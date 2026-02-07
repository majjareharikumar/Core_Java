package collections.List.Code;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,2,3,5,4,6,7,5,8,7);

        //way 1
        Map<Integer,Integer> hashMap=new HashMap<>();
        for(Integer i:list){
            hashMap.put(i,hashMap.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> m:hashMap.entrySet()){
            if(m.getValue()>1){
                System.out.println(m.getKey());
            }
        }

        //way 2
        List<Integer> list1=list.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream().filter(r->r.getValue()>1)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println(list1);
    }
}

