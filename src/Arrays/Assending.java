package Arrays;

import java.util.Arrays;

public class Assending {
    public static void main(String args[]){
        int a[]={0,2,6,8,4,9};
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                if(a[i]>a[j]){
                    int t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
