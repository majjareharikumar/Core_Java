package Java8.coding;

import java.util.List;
import java.util.Optional;
//Write a Java 8 program to find the second smallest element in a list of integers ?
public class SecondSmallest {
    public static void main(String[] args) {
        List<Integer> list=List.of(3,6,9,4,5,7,1,2,3,0,2,4,1);

        Optional<Integer> secondSmallest =list.stream().distinct().sorted().skip(1).findFirst();

        secondSmallest.ifPresent(s->System.out.println("Second Smallest number in the list:- "+s));
    }
}
