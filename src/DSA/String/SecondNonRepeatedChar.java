package DSA.String;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SecondNonRepeatedChar {
    public static void main(String[] args) {
        String str="programming";
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(char c:str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(map);

        List<Character> chars=new ArrayList<>();
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                chars.add(entry.getKey());
            }
        }
        System.out.println(chars);
        System.out.println("Second Non repeating chars is:- "+chars.get(1));

        //Java8
        Character ch=str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(e->e.getValue()==1)
                .map(Map.Entry::getKey)
                .skip(1)
                .findFirst()
                .orElseThrow();

        System.out.println("Second non repeated char is:- "+ch);

    }
}
