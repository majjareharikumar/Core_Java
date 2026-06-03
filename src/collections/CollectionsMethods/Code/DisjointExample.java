package collections.CollectionsMethods.Code;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DisjointExample {
    public static void main(String[] args) {
        List<Integer> disList= Arrays.asList(1,2,3,4);
        List<Integer>disList1=Arrays.asList(5,6,7,8);

        boolean result= Collections.disjoint(disList,disList1);
        System.out.println(result);
    }
}
