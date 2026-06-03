package collections.CollectionsMethods.Code;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FrequencyExample {
    public static void main(String[] args) {
        List<Integer> freList= Arrays.asList(10,11,12,11,13,10,11,12);

        int count= Collections.frequency(freList,11);
        System.out.println(count);
    }
}
