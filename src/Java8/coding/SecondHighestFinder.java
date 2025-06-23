package Java8.coding;

import java.util.List;
import java.util.Optional;
//Write a Java 8 program to find the second highest element in a list of integers ?
public class SecondHighestFinder {
    public static void main(String[] args) {
        List<Integer> list=List.of(2,3,6,4,7,8,9,1,2);

        Optional<Integer> secondHighestFinder=list.stream().distinct().sorted((a,b)->b-a).skip(1).findFirst();
        secondHighestFinder.ifPresent(s->System.out.println("Second Highest number in the list:- "+s));
    }
}
