package Java8.coding;

import java.util.Arrays;
import java.util.List;

//Find the total number of elements present in the list using Stream functions
public class CountElements {

    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6);
        Long count=numbers.stream().count();

        System.out.println("Total elements in the list is :- "+count);
    }
}
