package Basic;

import java.util.Scanner;

public class prime {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int i=sc.nextInt(),c=0;
//        for(int n=1;n<=i;n++){
//            if(i%n==0){
//                c++;
//            }
//        }
//        if(c==2){
//            System.out.println(i+" is Prime number");
//        }
//        else {System.out.println(i+" is Not Prime number");}
        System.out.println("Prime numbers are:- ");
        for(int o=2;o<=i;o++){
            int k=0;
            for(int j=1;j<=o;j++){

                if(o%j==0){
                    k++;
                }

            }
            if(k==2){
                System.out.print(o+" ");
            }
        }
    }
}
