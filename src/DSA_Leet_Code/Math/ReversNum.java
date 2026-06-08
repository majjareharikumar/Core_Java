package DSA_Leet_Code.Math;

import java.util.Scanner;

public class ReversNum {
    public static int revNum(int x){
        int rev=0;
        while(x!=0){
            int digit=x%10;
            x/=10;

            if(rev>Integer.MAX_VALUE/10 || rev==Integer.MAX_VALUE/10 && digit>7){
                return 0;
            }

            if(rev<Integer.MIN_VALUE/10 || rev==Integer.MIN_VALUE/10 && digit<-8){
                return 0;
            }
            rev=rev*10+digit;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:- ");
        int i=sc.nextInt();
        System.out.println(revNum(i));
    }
}

//Extract the last digit using % 10.
//Remove the last digit using / 10.
//Build the reversed number using rev = rev * 10 + digit.
//Before updating rev, check whether multiplying by 10 will exceed the 32-bit integer range.
//If rev > MAX_VALUE/10 or rev < MIN_VALUE/10, overflow/underflow will occur.
//If rev == MAX_VALUE/10, the next digit cannot be greater than 7.
//If rev == MIN_VALUE/10, the next digit cannot be less than -8.
//If any check fails, return 0; otherwise continue reversing the number.
