package Java17.code.Sealed_Class;

sealed class Payment permits UPI,CreditCard{
    public void pay(){
        System.out.println("Payment Done");

    }
}

//Allowed class
final class UPI extends Payment{
    public void mode(){
        System.out.println("Paid via UPI");
    }

}

final class CreditCard extends Payment{
    public void mode(){
        System.out.println("Paid via CreditCard");
    }

}

//non-allowed class
//final class NetBank extends Payment{
//    //java: class is not allowed to extend sealed class: Java17.code.Sealed_Class.Payment
//}

public class Positive {

    public static void main(String[] args) {
        UPI upi=new UPI();
        upi.pay();
        upi.mode();

        CreditCard cred=new CreditCard();
        cred.pay();
        cred.mode();
    }
}
