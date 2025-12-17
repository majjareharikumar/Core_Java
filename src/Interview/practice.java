package Interview;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class practice {

    public static void filterUniqeElements(List<Integer> mainList, List<List<Integer>> innerlist){
        Set<Integer> set=new HashSet<>();
        for(List<Integer> k:innerlist){
            set.addAll(k);
        }
        List<Integer> list=new ArrayList<>();

        for(int a:mainList){
            if(!set.contains(a)){
                list.add(a);
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        List<Integer> mainlist= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<List<Integer>> innerList=Arrays.asList(Arrays.asList(1,2,4,5,3,9),Arrays.asList(9,8,5,4,6,3));
        filterUniqeElements(mainlist,innerList);

        List<Integer> even=mainlist.stream().filter(e->e%2==0).toList();
        System.out.println(even);
    }


}
