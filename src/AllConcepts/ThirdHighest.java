package AllConcepts;

import java.util.Arrays;

public class ThirdHighest {
    public static void main(String args[]){
        int a[]={9,3,6,4,0,2,6,8,5,7,8};

        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++ ){
                if(a[i]<a[j]){
                    int t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }

        // Find the third highest unique number
        int distinctCount = 1, thirdHighest = -1;

        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1]) { // Count only distinct elements
                distinctCount++;
            }
            if (distinctCount == 3) {
                thirdHighest = a[i];
                break;
            }
        }

        System.out.println("Third Highest Number: " + thirdHighest);
//        System.out.println(Arrays.toString(a));
//        System.out.println("Third Highest No:-"+a[2]);
    }

}
