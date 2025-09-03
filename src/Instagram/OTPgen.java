package Instagram;

import java.util.Random;
import java.util.Scanner;

public class OTPgen {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random=new Random();

        System.out.println("Enter something to generate OPT OR entre EXIT to stop program");

        while (true){
            String s=sc.nextLine();

            if(s.equalsIgnoreCase("exit")){
                System.out.println("Thanks for choosing our App, Kaindly visit again");
                break;
            }
            else {

                int Otp=100000+random.nextInt(900000);
                System.out.println("OPT:- "+Otp);
            }
        }
    }
}
