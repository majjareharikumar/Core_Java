package Java8.coding;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Write a Java 8 program to find the frequency of each word in a list of strings?
public class WordFrequency {
    public static void main(String[] args) {
        List<String> words=List.of("apple","banana","cherry","apple","cherry","banana","papaya");

        Map<String,Long> wordCount=words.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        wordCount.forEach((word,count)->System.out.println(word+" :- "+count));
    }
}
