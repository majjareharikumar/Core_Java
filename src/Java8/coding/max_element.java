package Java8.coding;
//Write a Java 8 program to find the maximum element from a list ?
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class max_element {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,43,14,55,6,7,8,9);
        Optional<Integer> max=list.stream().max(Integer::compareTo);

        System.out.println("Max number in the list:- "+max);
    }
}
