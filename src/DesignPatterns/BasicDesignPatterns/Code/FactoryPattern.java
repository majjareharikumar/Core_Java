package DesignPatterns.BasicDesignPatterns.Code;

import java.awt.*;
import java.util.Scanner;

interface payment{
    void pay();
}

class UPIPayment implements payment{

    @Override
    public void pay() {
        System.out.println("paid using UPI");
    }
}

class CreditCard implements payment{
    @Override
    public void pay(){
        System.out.println("Paid using CreditCard");
    }
}

class NetBanking implements payment{
    @Override
    public void pay(){
        System.out.println("Paid using NetBanking");
    }
}

class FactoryClass{
    public static payment getPayment(String mode) {
        if(mode.equalsIgnoreCase("upi")){
            return new UPIPayment();
        } else if (mode.equalsIgnoreCase("cred")) {
            return new CreditCard();
        }else if(mode.equalsIgnoreCase("netbanking")){
            return new NetBanking();
        }
        throw new IllegalArgumentException("Invalid payment mode");
    }
}
public class FactoryPattern {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter payment mode");
        String str=sc.nextLine();
        payment pay=FactoryClass.getPayment(str);
        pay.pay();
    }
}
