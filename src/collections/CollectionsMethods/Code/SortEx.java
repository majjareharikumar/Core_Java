package collections.CollectionsMethods.Code;

import java.util.*;

public class SortEx {
    public static void main(String[] args) {
        List<Integer> Sortlist=Arrays.asList(4,6,9,0,7,8,2,3,1);
        Collections.sort(Sortlist);
        System.out.println(Sortlist);

        List<String> stringList=Arrays.asList("Hari","Arun","Hani","Ram","Mani");
        Collections.sort(stringList);
        System.out.println(stringList);
    }
}
