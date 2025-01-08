package String;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.next();
        //without using inbuilt method reverse()
        char[] c=s.toCharArray();
        String r="";
        for(int i=c.length-1;i>=0;i--){
            r+=c[i];
        }
        String rev=new String(r);

        System.out.println("---------");
        System.out.println("Original String:- "+s);
        System.out.println("====================");
        System.out.println("Reverse String Using normal way:- "+rev);

        //using StringBuilder and String Buffer

        StringBuffer sb=new StringBuffer(s);
        StringBuilder SB=new StringBuilder(s);
        System.out.println("Reverse String Using StringBuffer way:- "+sb.reverse());
        System.out.println("Reverse String Using StringBuilder way:- "+SB.reverse());


    }
}
