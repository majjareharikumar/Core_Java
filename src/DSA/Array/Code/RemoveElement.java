package DSA.Array.Code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class RemoveElement {
    public static int removeElement(int[] nums, int val){
        List<Integer> al=new ArrayList();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                al.add(nums[i]);
            }
        }
        nums= al.stream().mapToInt(Integer::intValue).toArray();
       return nums.length;

    }
    public static void main(String[] args) {
        int[] v= {3,2,2,3};
        int val=3;
        System.out.print(removeElement(v,val));
    }
}
