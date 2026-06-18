package SOLID.Code;
//All payment types in same service. If any new payment type came we need to change the existing logic
class PaymentService{
    public void makePayment(String paymentType){
        if(paymentType.equals("UPI")){
            System.out.println("Paid through UPI");
        }else if(paymentType.equals("CRED")){
            System.out.println("Paid through Credit card");
        }else {
            System.out.println("Invalid Payment Type");
        }
    }
}

//Creating Interface for payment and implementing it with required type. So that we can implement it with new type easily without affecting flow
interface Payment{
    void pay();
}

class UPIType implements Payment{

    @Override
    public void pay() {
        System.out.println("Paid Through UPI");
    }
}
class Card implements Payment{

    @Override
    public void pay() {
        System.out.println("Paid Though Cred");
    }
}
//New feature
class NetBanking implements Payment{

    @Override
    public void pay() {
        System.out.println("Paid Through NetBanking");
    }
}
class MakePaymentService{

    public void makePayment(Payment payment){
        payment.pay();
    }

}
public class OpenCloseEX {
    public static void main(String[] args) {
        PaymentService pay=new PaymentService();
        pay.makePayment("UPI");
        pay.makePayment("CRED");
        pay.makePayment("Net");

        MakePaymentService make=new MakePaymentService();
        make.makePayment(new UPIType());
        make.makePayment(new Card());
        make.makePayment(new NetBanking());
    }
}
