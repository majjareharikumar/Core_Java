package collections.List.Code;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeDemo {
    public static void main(String[] args) {
        List<Integer> list=new CopyOnWriteArrayList<>(Arrays.asList(1,2,3,4,5,6));

        for(Integer i:list){
            if(i==3){
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
