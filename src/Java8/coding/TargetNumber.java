package Java8.coding;

import java.util.Arrays;
import java.util.List;

//Write a Java 8 program to check if a list contains a specific element ?
public class TargetNumber {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,7,8,5,9,6);
        int target=5;

        boolean isPresent=list.stream().anyMatch(n->n==target);

        System.out.println("List Contains "+ target+":- "+isPresent);
    }
}
