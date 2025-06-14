package Java8.coding;

import java.util.Arrays;
import java.util.List;

//Write a Java 8 program to find the sum of all even numbers in a list of integers ?
public class EvenSum {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,14,16,18,20);

        int evenSum= list.stream().filter(n->n%2==0).mapToInt(n->n).sum();

        System.out.println("Sum of Even numbers in the list:- "+evenSum);
    }
}
