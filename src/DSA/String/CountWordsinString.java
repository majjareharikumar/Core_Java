package DSA.String;

import java.util.Arrays;
import java.util.stream.Stream;

public class CountWordsinString {
    public static long countWords(String s){
        String[] words=s.trim().split(" ");
        return words.length;

//        Stream<String> w= Arrays.stream(s.trim().split(" "));
//        return w.toList().size();
    }

    public static void main(String[] args) {
        String s="Majjare Hari kumar";
        System.out.print(countWords(s));
    }
}
