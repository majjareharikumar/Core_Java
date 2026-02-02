package DSA.String;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicate_characters {
    public static void main(String[] args) {
       String word="programming";
       Map<Character,Integer> map=new LinkedHashMap<>();
       for(char c:word.toCharArray()){
           map.put(c,map.getOrDefault(c,0)+1);
       }
        System.out.println("Duplicate characters");
       for(Map.Entry<Character,Integer> entry:map.entrySet()){
           if(entry.getValue()>1){
               System.out.print(entry.getKey()+",");
           }
       }
        System.out.println();
       //java 8
        System.out.println("Using java8");
        Map<Character,Long> map1=word.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()));
       map1.entrySet().stream()
               .filter(e->e.getValue()>1)
               .forEach(e-> System.out.print(e.getKey()+","));

    }
}
