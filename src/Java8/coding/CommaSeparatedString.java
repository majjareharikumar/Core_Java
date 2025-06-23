package Java8.coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Write a Java 8 program to convert a list of integers to a comma-separated string ?
public class CommaSeparatedString {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);

        String commaSeparatedString=list.stream().map(Object::toString).collect(Collectors.joining(","));
        System.out.println("commaSeparatedString:- "+commaSeparatedString);
    }
}
