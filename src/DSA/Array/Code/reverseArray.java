package DSA.Array.Code;

import java.util.Arrays;
import java.util.stream.IntStream;

public class reverseArray {


    public static void main(String[] args) {
        int[] a={10,20,30,40,50,60};

        //way1
        int[] k=new int[a.length];
        int index=0;
        for(int l=a.length-1;l>=0;l--){
            k[index++]=a[l];
        }
        for(int n:k){
            System.out.print(n+" ");
        }
        System.out.println();
        //way2
        int i=0,j=a.length-1,temp;
        while(j>=i){
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        for(int n:a){
            System.out.print(n+" ");
        }

        System.out.println();
        int[] reverse= IntStream.range(0,a.length)
                .map(p->a[a.length-p-1])
                .toArray();

        for(int n:reverse){
            System.out.print(n+" ");
        }
    }
}
