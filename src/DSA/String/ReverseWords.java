package DSA.String;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWords {
    public static void main(String[] args) {
        String str="majjare hari nath kumar babu";
        String[] words=str.split(" ");

        String result="";

        for(String word:words){
            String reversword="";
            for(int i=word.length()-1;i>=0;i--){
                reversword+=word.charAt(i);
            }
            result+=reversword+" ";
        }

        System.out.println(result.trim());

        //Java8
        System.out.println("Using java8");
        String reverse= Arrays.stream(words)
                .map(word->new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println(reverse);
    }
}
