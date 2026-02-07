package collections.List.Code;

import java.util.*;

public class RemoveNulls {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>(Arrays.asList("a","b",null,"c","d",null,"e"));
        Iterator<String> itr=list.iterator();
        while(itr.hasNext()){
            if(itr.next()==null){
                itr.remove();
            }
        }
        System.out.println(list);
    }
}
