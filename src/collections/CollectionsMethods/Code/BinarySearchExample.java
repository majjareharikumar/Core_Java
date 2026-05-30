package collections.CollectionsMethods.Code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchExample {
    public static void main(String[] args) {
        List<Integer> binaryList= new ArrayList<>(Arrays.asList(1, 2, 5, 7, 8));
        int index= Collections.binarySearch(binaryList,10);
        System.out.println("Index of Element:-"+index);
    }
}
