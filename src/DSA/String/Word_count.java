package DSA.String;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Word_count {
    public static void main(String[] args) {
        String str = "java is easy and java is powerful";
        String[] words=str.split(" ");
        System.out.println("Total words in string :- "+words.length);
        Map<String,Integer> map=new LinkedHashMap<>();
        for(String s:words){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(Map.Entry<String,Integer> s:map.entrySet()){
            System.out.println(s.getKey()+"-->"+s.getValue());
        }

        map.forEach((k,v)-> System.out.println(k+"-->"+v));

        //Java8
        System.out.println("using java 8");
        Map<String,Long> map1= Arrays.stream(words)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
        map1.forEach((k,v)-> System.out.println(k+"-->"+v));
    }
}
