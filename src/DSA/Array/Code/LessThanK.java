package DSA.Array.Code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LessThanK {
    public static void lessThan(int[] arr,int k){
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]<k){
                al.add(arr[i]);
            }
        }
        int[] arr1=new int[al.size()];
        for(int j=0;j<al.size();j++){
            arr1[j]=al.get(j);
        }

        //return al.stream().mapToInt(Integer::intValue).toArray();

        System.out.println(al);
        //return arr1;
        //return Arrays.stream(arr).filter(i->i<k).toArray();
    }

    public static void main(String[] args) {
        int[] arr={3,4,2,5,6,7,8,9,7,8,10};
        int k=6;
        lessThan(arr,k);

    }
}
