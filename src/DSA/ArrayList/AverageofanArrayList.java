package DSA.ArrayList;

import java.util.Arrays;
import java.util.List;

public class AverageofanArrayList {

    public static double average(List<Integer> al){
//        int i=0,c=0;
//        for(int j=0;j<al.size();j++){
//            if(al.get(j)>=0){
//                i+=al.get(j);
//                c++;
//            }
//        }
        return al.stream().filter(i->i>=0).mapToInt(Integer::intValue).average().orElse(0.0);

    }

    public static void main(String[] args) {
        List<Integer> al= Arrays.asList(-12, 8, -7, 6, 12, -9, 14);
        System.out.println(average(al));
   }
}
