package Interview;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class practice {
    int j=1;
    int sum=0;
   public void  recursion(int n){

        if(j>n){
            System.out.println(sum);
            return;
        }
       sum+=j;
        j++;
        recursion(n);
    }
    public static void main(String[] args) {
       int i=4;
       practice p=new practice();
       p.recursion(i);
    }
}
