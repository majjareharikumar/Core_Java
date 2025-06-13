package Java8.coding;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Find the first element of the list using Stream functions
public class FirstElement {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5);
        Optional<Integer> first =numbers.stream().findFirst();
        System.out.println("First element in the list is :- "+first);
        first.ifPresent(f -> System.out.println("First element: " + f));
    }
}
