package collections.CollectionsMethods.Code;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SwapEx {
    public static void main(String[] args) {
        List<Integer> SwapList= Arrays.asList(3,4,7,8,9);
        System.out.println("List Before swap");
        System.out.println(SwapList);
        Collections.swap(SwapList,1,2);
        System.out.println("List After swap");
        System.out.println(SwapList);
    }
}
