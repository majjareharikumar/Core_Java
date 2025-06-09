package OOPS.Code;

//Interface
interface Bank{
    //Abstrac methods
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

class Customer{


    //encapsulation
    private String name;
    private String custId;

    //Constructor
    public Customer(String name, String custId) {
        this.name = name;
        this.custId = custId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }


    public String DisplayInfo() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", custId='" + custId + '\'' +
                '}';
    }
}

//Driver class
class SavingAccount extends Customer implements Bank{

    private double balance;

    public SavingAccount(String name, String custId,double balance) {
        super(name, custId);
        this.balance=balance;
    }

    //Method Overriding
    @Override
    public void deposit(double amount) {

        balance+=amount;
        System.out.println("Deposited amount:- "+amount);
    }

    @Override
    public void withdraw(double amount) {

        if(amount<=balance){
            balance-=amount;
            System.out.println("Withdraw amount:- "+amount);
        }
        else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }


    //Method Overloading
    public void witdraw(double amount, String note){
        System.out.println("Note:- "+note);
        withdraw(amount);
    }
}

public class AllConcepts {

    public static void main(String[] args) {

        SavingAccount av=new SavingAccount("Hari","H9",10000);

        System.out.println(av.DisplayInfo());

        av.deposit(500);
        av.withdraw(100);
        av.witdraw(200,"ATM");
        av.getBalance();

    }
}
