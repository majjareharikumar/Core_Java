package AllConcepts;

import java.util.ArrayList;
import java.util.List;

public class prime {
    public static void main(String[] args){
        int n=50;

        List<Integer> pl=new ArrayList<Integer>();

        for (int i=2;i<n;i++){
            if(isPrime(i)){
                pl.add(i);
            }
        }
        System.out.println("Prime numbers:- "+pl);
    }

    public static boolean isPrime(int n){
        if(n<2) return false;

        for(int i=2;i*i<=n;i++){
            if (n%i==0) return false;
        }
        return true;
    }
}
