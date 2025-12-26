package DSA.String;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class first_non_repeated_characte {
    public static void main(String[] args) {
        String word="programming";
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(char c:word.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> c:map.entrySet()){
            if(c.getValue()==1){
                System.out.println("First non repeating character:- "+c.getKey());
                break;
            }
        }

        //Java8
        Map<Character,Long> map1=word.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()));
        System.out.println(map1);
        Character c=map1.entrySet().stream()
                .filter(e->e.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
        System.out.println(c);
    }
}
