package collections.CollectionsMethods.Code;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FillExample {
    public static void main(String[] args) {
        List<Integer> fillList= Arrays.asList(1,2,3,4,5);
        System.out.println("Before fill:- "+fillList);
         Collections.fill(fillList,10);
        System.out.println("After fill:- "+fillList);
    }
}
