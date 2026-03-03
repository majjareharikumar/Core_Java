package collections.Map;

import java.util.*;

public class Remove_Duplicate_from_Map {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("A",10);
        map.put("B",20);
        map.put("C",30);
        map.put("D",10);
        map.put("E",20);

        Set<Integer> set=new HashSet<>();
        Map<String,Integer> result=new HashMap<>();

        for(Map.Entry<String,Integer> e: map.entrySet()){
            if(set.add(e.getValue())){
                result.put(e.getKey(),e.getValue());
            }
        }
        System.out.println(result);
    }
}
