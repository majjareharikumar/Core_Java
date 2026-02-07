package collections.List.Code;

import java.util.*;

public class SafeRemoval {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        Iterator<Integer> itr=list1.iterator();

        while (itr.hasNext()){
            Integer n= itr.next();
            if(n%2==0){
                itr.remove();
            }
        }
        //System.out.println(list1);

        list1.removeIf(i->i%2==0);
        System.out.println(list1);
    }
}
