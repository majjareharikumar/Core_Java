package DSA.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListinsertion {
    public static ArrayList<Integer> insertion(int[] arr){
//        List<Integer> al= new ArrayList<>();
//        for(int i:arr){
//            al.add(i);
//        }

        return new ArrayList<>(Arrays.stream(arr).boxed().toList());

    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        System.out.print(insertion(arr));
    }
}
