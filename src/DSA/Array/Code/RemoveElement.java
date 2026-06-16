package DSA.Array.Code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class RemoveElement {
    public static void removeElement(int[] nums, int val){
        List<Integer> al=new ArrayList();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                al.add(nums[i]);
            }
        }
        nums= al.stream().mapToInt(Integer::intValue).toArray();
      for(int n:nums){
          System.out.print(n+",");
      }

    }
    public static void main(String[] args) {
        int[] v= {1,2,3,4,5};
        int val=3;
        removeElement(v,val);
    }
}
