package String;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to check");
        String s=sc.next();
        char[] c=s.toCharArray();
        String p="";
        for(int i=c.length-1;i>=0;i--){
            p+= c[i];
        }



        if(s.equals(p)){
        System.out.println("Given String "+s +" is palindrome");}
        else {System.out.println("Given String "+s+" is not palindrome");}
    }
}
