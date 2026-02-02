package DSA.String;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfChar {
    public static void main(String[] args) {
        String str="majjareharikumar";
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(char c:str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+"-->"+entry.getValue());
        }

        //Java8
        System.out.println("using java8");
        Map<Character,Long> map1=str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()));
        map1.entrySet().stream()
                .forEach(e-> System.out.println(e.getKey()+"-->"+e.getValue()));

    }
}
