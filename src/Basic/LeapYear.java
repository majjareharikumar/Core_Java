package Basic;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Year");
        int y=sc.nextInt();

        if(y%4==0 || y%400==0 & y%100!=0){
            System.out.println(y+" is Leap Year");
        }
        else {System.out.println(y+" is Not Leap Year");}
    }
}
//
//What is a Leap Year?
//-->A leap year is a year that has 366 days instead of 365. It happens every 4 years to help synchronize the calendar with the Earth's orbit around the sun.
//✅ Leap Year Rules:
//A year is a leap year if:It is divisible by 4 AND Not divisible by 100, unless it is also divisible by 400
//y%4==0 || y%400==0 & y%100!=0
