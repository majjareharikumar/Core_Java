package collections.List.Code;

import java.util.*;

public class FailFastDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4));

        for(Integer i : list){
            if(i == 2){
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
