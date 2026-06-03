package collections.CollectionsMethods.Code;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CopyExample {
    public static void main(String[] args) {
        List<Integer> source= Arrays.asList(1,2,3,4);
        List<Integer> destination=Arrays.asList(0,0,0,0);

        Collections.copy(destination,source);
        System.out.println(destination);
    }
}
