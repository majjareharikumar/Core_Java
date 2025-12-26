package DSA.String;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class First_repeated_Character {
    public static void main(String[] args) {
        String str="majjareharikumar";
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(char c:str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> c: map.entrySet()){
            if(c.getValue()>1){
                System.out.println("First repeated character:- "+c.getKey());
                break;
            }
        }
        //Java8
        System.out.println("using java8");
        Character ch=str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue()>1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
        System.out.println("First repeated character:- "+ch);
    }
}
