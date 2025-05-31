package AllConcepts;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class sortAssending {

    public static void main(String[] args){
        Integer b[]={8,4,5,9,1,2,0,3,4,6,7};

        for(int i=0;i<b.length;i++){
            for(int j=i;j<b.length;j++){
                if(b[i]>b[j]){
                    int t=b[i];
                    b[i]=b[j];
                    b[j]=t;
                }
            }
        }

        HashSet<Integer> s=new HashSet<Integer>(Arrays.asList(b));
        System.out.println(s);

    }
}
