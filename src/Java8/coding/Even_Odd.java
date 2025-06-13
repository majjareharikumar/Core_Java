package Java8.coding;
//Java 8 Program to Filter Even and Odd Numbers
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Even_Odd {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,4,3,5,6,7,5,7,8,7,9,10);

        Set<Integer> s=new HashSet<>(numbers);
        List<Integer> even=s.stream().filter(n->n%2==0).collect(Collectors.toList());

        List<Integer> odd=s.stream().filter(n->n%2!=0).collect(Collectors.toList());
        System.out.println("Even Numbers:- "+even);
        System.out.println("Odd Numbers:- "+odd);
    }
}
