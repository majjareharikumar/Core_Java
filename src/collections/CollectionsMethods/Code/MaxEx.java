package collections.CollectionsMethods.Code;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxEx {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(45,1,4,6,7,8,9,0,45,100);
        int max= Collections.max(list);
        System.out.println(max);
    }
}
