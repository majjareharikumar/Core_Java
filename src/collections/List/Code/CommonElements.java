package collections.List.Code;

import java.util.*;

public class CommonElements {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        List<Integer> list2=new ArrayList<>(Arrays.asList(4,2,6,3,7,4,12,13,11));

        for(Integer i:list1){
            if(list2.contains(i)){
                System.out.print(i+" ");
            }
        }

    }
}
