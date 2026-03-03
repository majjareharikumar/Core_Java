package collections.Map;

import java.util.*;

public class Sort_Map_by_Value {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("A",10);
        map.put("B",20);
        map.put("C",5);
        map.put("D",25);

        List<Map.Entry<String,Integer>> list=new ArrayList<>(map.entrySet());
        Collections.sort(list,(a,b)->a.getValue()-b.getValue());

        Map<String,Integer> result=new LinkedHashMap<>();
        for(Map.Entry<String,Integer> e:list){
            result.put(e.getKey(),e.getValue());
        }

        System.out.println(result);

    }
}
