package Instagram.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AllMissingNumbers {
    public static void main(String[] args) {
        int[] arr={1,2,5,3,7,9};
        int min= Arrays.stream(arr).min().getAsInt();
        int max=Arrays.stream(arr).max().getAsInt();

        Set<Integer> collect=Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toSet());

        List<Integer> result= IntStream.rangeClosed(min,max)
                .boxed()
                .filter(e->!collect.contains(e))
                .toList();

        System.out.println(result);
    }
}
