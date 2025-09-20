package Interview.java8.code;

import java.util.Map;
import java.util.stream.Collectors;

public class Count_the_frequency_of_each_character {
    public static void main(String[] args) {
        String name="majjare hari kumar";
//First we need to convert it into chars and then map to char object.
//// Then we can use groupingBy in collect to group the all objects and also we need to use counting to count the chars
//        👉 Why used?
//        chars() → converts String to IntStream.
//        mapToObj() → converts int → Character.
//        groupingBy() → groups characters.
//        counting() → counts occurrences.

         Map<Character,Long> count=name.chars()
                 .mapToObj(c->(char)c)
                 .collect(Collectors.groupingBy(c->c,Collectors.counting()));
        System.out.println(count);
    }
}
