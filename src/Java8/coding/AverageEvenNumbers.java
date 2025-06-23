package Java8.coding;
//Write a Java 8 program to calculate the average of even numbers in a list of integers ?
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageEvenNumbers {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10,12,14,16);
        OptionalDouble average=list.stream().filter(n->n%2==0).mapToInt(n->n).average();

        System.out.println("Average of Even Numbers:- "+average);
    }
}
