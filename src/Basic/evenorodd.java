package Basic;

import java.util.Scanner;

public class evenorodd {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number");
        int i=scanner.nextInt();
        if(i%2==0){
            System.out.println(i+ " Is Even Number");
        }
        else {System.out.println(i+ " Is Odd Number");}
    }
}
