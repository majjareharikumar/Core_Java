package Java8.coding;

import java.util.Arrays;
import java.util.List;

//Write a Java 8 program to find the average length of strings in a list of strings?
public class AverageStringLength {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Majjare","Hari","Nath","Kumar","Babu");

        double averageStringLength = list.stream().mapToInt(String::length).average().orElse(0.0);

        System.out.println("AverageStringLength :- "+averageStringLength);
    }
}
