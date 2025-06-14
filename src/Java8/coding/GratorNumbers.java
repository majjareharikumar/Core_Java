package Java8.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Write a Java 8 program to print all elements in a list are greater than a given value?
public class GratorNumbers {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(23,12,43,45,56,76,56);
        int a=25;
        List<Integer> gratorNumbers=list.stream().filter(n->n>a).collect(Collectors.toList());
        System.out.println("GratorNumbers of 25 in the list :- "+gratorNumbers);
    }

}
