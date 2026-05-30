package collections.CollectionsMethods.Code;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseEx {
    public static void main(String[] args) {
        List<Integer> revList= Arrays.asList(3,4,6,1,8,2,9);
        Collections.reverse(revList);
        System.out.println(revList);
    }
}
