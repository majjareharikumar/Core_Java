package collections.List;

import java.util.Arrays;
import java.util.List;

public class Split_List {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,0);
        List<Integer>firstList=list.subList(0,list.size()/2);
        List<Integer>SecondList=list.subList(list.size()/2,list.size());

        System.out.println("Full List:- "+list);
        System.out.println("First List:- "+firstList);
        System.out.println("Second List:- "+SecondList);
    }
}
