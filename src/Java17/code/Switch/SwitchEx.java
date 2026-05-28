package Java17.code.Switch;

import java.util.Scanner;

public class SwitchEx {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter code");
        int code=sc.nextInt();

        //Before Java17
        String status="";

        switch (code){
            case 200:
                status="success";
                break;

            case 400:
                status="Bad Request";
                break;

            case 404:
                status="Not Found";
                break;

            case 500:
                status="Internal Server Error";
                break;

            case 503:
                status="Server Unavailable";
                break;

            default:
                status="Invalid code";


        }
        //System.out.println(status);

        //After java17
        String status1=switch (code){
            case 200->"Success";
            case 400->"Bad Request";
            case 404->"Not Found";
            case 500->"Internal Server Error";
            case 503->"Server Unavailable";
            default -> "Invalid code";
        };
        System.out.println(status1);
    }
}
