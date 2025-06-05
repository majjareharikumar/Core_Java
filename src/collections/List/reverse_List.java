package collections.List;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class reverse_List {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);
        Collections.reverse(list);
        System.out.println(list);
    }
}
