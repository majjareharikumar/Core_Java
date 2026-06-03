package collections.CollectionsMethods.Code;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReplaceAllExample {
    public static void main(String[] args) {
        List<Integer> replaceList= Arrays.asList(10,20,30,10,40,10);
        Collections.replaceAll(replaceList,10,100);
        System.out.println(replaceList);
    }
}
