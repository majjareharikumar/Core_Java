package String;

import java.util.Scanner;

public class concatenate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the strings");
        String s1=sc.next();
        String s2=sc.next();

        System.out.println("concatenation of Strings :- "+s1+s2);
        System.out.println("concatenation of Strings :- "+s1.concat(s2));
    }
}
