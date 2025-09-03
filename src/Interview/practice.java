package Interview;


import java.util.*;

public class practice {
    public static void uniqu(List <Integer>mainList, List<List<Integer>> innerList){
        Set<Integer> set=new HashSet<>();
        for(List<Integer> n:innerList){
            set.addAll(n);
        }
        List<Integer> result=new ArrayList<>();
        for(Integer s: mainList){
            if(set.contains(s)){
                result.add(s);
            }
        }
        System.out.println(set);
    }

    public static void main(String[] args) {
        List<Integer> mainList=Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<List<Integer>> innerList=Arrays.asList(Arrays.asList(2,3,6,4),Arrays.asList(7,3,9));
        practice.uniqu(mainList,innerList);
    }
}
