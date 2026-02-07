package collections.List.Code;

import java.util.*;

public class ReadOnlyList {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        list.add(8);
        System.out.println(list);

        List<Integer> readOnly= Collections.unmodifiableList(new ArrayList<>(Arrays.asList(1,2,3,4,5,6)));
        readOnly.add(7);
        System.out.println(readOnly);
    }
}
