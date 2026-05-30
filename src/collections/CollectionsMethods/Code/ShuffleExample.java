package collections.CollectionsMethods.Code;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleExample {
    public static void main(String[] args) {
        List<Integer> ShuffleList= Arrays.asList(2,4,6,5,7);
        System.out.println("Before Shuffle");
        System.out.println(ShuffleList);
        Collections.shuffle(ShuffleList);
        System.out.println("After Shuffle");
        System.out.println(ShuffleList);
    }
}
