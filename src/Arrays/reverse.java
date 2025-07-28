package Arrays;

import java.util.Arrays;

public class reverse {
    public static void main(String[] args){
        int a[]={3,5,3,7,6,8,9};
        int b[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            b[i]=a[a.length-1-i];
        }

        System.out.println(Arrays.toString(b));
    }
}
