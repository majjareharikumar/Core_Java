package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenORodd {
    public static void main(String[] args){
        List<Integer> l= Arrays.asList(1,4,5,2,7,3,6,10);

        l.stream().filter(n->n%2==0).forEach(System.out::println);
    }
}
