package collections.CollectionsMethods.Code;

import java.util.*;

public class RotateExample {
    public static void main(String[] args) {
        List<Integer> rotateList=Arrays.asList(1,2,3,4,5);
        Collections.rotate(rotateList,2);
        System.out.println(rotateList);
    }
}
