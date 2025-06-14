package Java8.coding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Write a Java 8 program to remove duplicate elements from a list ?
public class UniqueNumbers {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,2,3,4,5,4,5,6,76,5);

        Set<Integer> set=new HashSet<>(list);
        System.out.println("Original list:- "+list);
        System.out.println("Using Set interface:- "+set);

        List<Integer> uniqueNumbsers=list.stream().distinct().collect(Collectors.toList());

        System.out.println("Using Java8:- "+uniqueNumbsers);
    }
}
