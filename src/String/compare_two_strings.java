package String;

import java.util.Scanner;

public class compare_two_strings {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter strings to compare");
        String s1=sc.next();
        String s2=sc.next();
        //way 1
//        if(s1.equals(s2)){
//            System.out.println("Both Strings are equal");
//        }
//        else {System.out.println("Both Strings are not equal");}
        //Way2
//        boolean r=false;
//        char[] c1=s1.toCharArray();
//        char[] c2=s2.toCharArray();
//        if(s1.length()==s2.length()){
//            for(int i=0;i<c1.length;i++){
//                if(c1[i]==c2[i]){r=true;}
//                else {r=false;}
//            }
//        }
//        else {r=false;}
//
//        if(r){
//        System.out.println("Both are equal");}
//        else {System.out.println("Both are not equal");}
        //using string method equalsIgnoreCase()

        if(s1.equalsIgnoreCase(s2)){
            System.out.println("Both Strings are equal");
        }
        else {System.out.println("Both Strings are not equal");}
    }
}
