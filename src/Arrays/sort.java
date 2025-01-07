package Arrays;

import java.util.Arrays;

public class sort {
    public static void main(String[] args){
        int a[]={7,5,9,2,4,1,5,6};
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
