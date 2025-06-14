package Java8.coding;

//Write a Java 8 program to calculate the sum of integers in a list ?
import java.util.Arrays;
import java.util.List;

public class NumberSum {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);

        Integer sum=list.stream().reduce(0,Integer::sum);
        System.out.println("Sum of elements in list:- "+sum);
    }
}
