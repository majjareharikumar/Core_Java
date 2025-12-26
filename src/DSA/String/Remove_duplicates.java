package DSA.String;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Remove_duplicates {
    public static void main(String[] args) {
        String word="programming";
        Set<Character> ch= new LinkedHashSet<>();
        String result1="";
        for(char c:word.toCharArray()){
            ch.add(c);
        }
       for(char c:ch){
           result1+=c;
       }
        System.out.println("Using set:- "+result1);

       String result2="";
       for(int i=0;i<word.length();i++){
           char c=word.charAt(i);
           if(result2.indexOf(c)==-1){
               result2+=c;
           }
       }
        System.out.println("With out collections:- "+result2);

       //Java 8
        String result3=word.chars()
                .mapToObj(c->(char)c)
                .map(String::valueOf)
                .distinct()
                .collect(Collectors.joining());
        System.out.println("Using java8:- "+result3);
    }
}
