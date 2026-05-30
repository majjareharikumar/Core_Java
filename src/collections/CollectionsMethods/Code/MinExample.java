package collections.CollectionsMethods.Code;

import java.util.Collection;
import java.util.*;

public class MinExample {
    public static void main(String[] args) {
        List<Integer> list=List.of(1,3,6,2,7,0);
        int min= Collections.min(list);
        System.out.println("List min value:- "+min);

        Set<Integer> set= Set.of(2,4,1,5,7);
        int min1=Collections.min(set);
        System.out.println("Set min value:- "+min1);
    }
}
