package Interview.java8.Stream.Intermediate.Filter_Fun;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class filterex {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,3,4,5,6,7,2,7,8,9,10,34,2,556,78,34);

        //collect(Collector) → Gather filtered elements into List/Set/Map.
        List<Integer> result=numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println("even Numbers:- "+result);

        //forEach(Consumer) → Perform action on filtered elements.
        numbers.stream().filter(n->n>10).forEach(System.out::println);

        //count() → Count how many elements matched the condition.

        long count=numbers.stream().filter(n->n%2==0).count();
        System.out.println("Even number count:- "+count);

        //findFirst() / findAny() → Get first or any matching element.
       Optional<Integer> first= numbers.stream().filter(n->n%2==0).findFirst();
        System.out.println("First even number:- "+first);
// If your findAny() is always returning the same number, it’s because you’re using a sequential stream. To see different results, try using a parallel stream (parallelStream()).
            Optional<Integer> any=numbers.parallelStream().filter(n->n%2==0).findAny();
        System.out.println("find any even number:- "+any);

        //anyMatch() / allMatch() / noneMatch() → Check conditions on filtered elements.
        boolean hasbig=numbers.stream()
                .filter(Objects::isNull)
                .noneMatch(n->n>10);
        System.out.println("Has Big:- "+hasbig);

    }
}
