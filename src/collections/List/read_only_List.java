package collections.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class read_only_List {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        list.add(9);

        List<Integer> readonly= Collections.unmodifiableList(new ArrayList<>(list));
        readonly.add(9);

        System.out.println(list);
    }
}
