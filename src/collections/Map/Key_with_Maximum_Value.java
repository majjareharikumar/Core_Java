package collections.Map;

import java.util.*;

public class Key_with_Maximum_Value {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("A",10);
        map.put("B",20);
        map.put("C",30);
        map.put("D",40);
        map.put("E",10);
        map.put("F",90);

        String maxKye=null;
        int max=Integer.MIN_VALUE;

        for(Map.Entry<String,Integer> m: map.entrySet()){
            if(m.getValue()>max){
                max=m.getValue();
                maxKye=m.getKey();
            }
        }
        System.out.println(maxKye);
    }
}
