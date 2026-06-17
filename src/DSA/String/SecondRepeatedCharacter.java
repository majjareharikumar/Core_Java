package DSA.String;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondRepeatedCharacter {
    public static void main(String[] args) {
        String str="programming";
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(char c:str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(map);
        List<Character> chars=new ArrayList<>();
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()>1){
                chars.add(entry.getKey());
            }
        }
        System.out.println(chars);
        System.out.println("Second repeated char is:- "+chars.get(1));

        //Java 8
        String s="programming";
        List<Character> repetedChar=s.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        if(repetedChar.size()>=2){
            System.out.println("Second repeated char:-"+repetedChar.get(1));
        }else{
            System.out.println("No second repeated char");
        }
    }
}
