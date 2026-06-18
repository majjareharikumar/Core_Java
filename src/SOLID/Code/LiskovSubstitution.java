package SOLID.Code;

//Negative scenario. FixedDeposit will not withdraw amount as per our business rule. So we are throwing exception and it is breaking flow .
class Account1{
    public void withdraw(double amount){
        System.out.println("Amount withdraw:- "+amount);
    }
}
class SavingsAccount extends Account1{
    @Override
    public void withdraw(double amount){
        System.out.println("Savings Amount withdraw:- "+amount);
    }
}
class FixedDeposit extends Account1{
    public void withdraw(double amount){
        throw new UnsupportedOperationException("not allowed");
    }
}

//Positive Liskov

interface depositable{
    public void deposit(double amount);
}
interface withdrawable{
    public void withdraw(double amount);
}

abstract class Account2{
    protected double balance;

    public Account2(double balance){
        this.balance=balance;
    }
    public void showBalance(){
        System.out.println("Balance:-"+balance);
    }
}

class SavingAccount extends Account2 implements depositable,withdrawable{

    public SavingAccount(double balance){
        super(balance);
    }
    @Override
    public void deposit(double amount) {
        balance+=amount;
        System.out.println("Saving Deposit Amount:-"+amount);
    }

    @Override
    public void withdraw(double amount) {
        if(amount<=balance){
            balance-=amount;
            System.out.println("WithDraw amount:-"+amount);
        }
        else {
            System.out.println("insufficient balance");
        }

    }

}

class FixedDeposit1 extends Account2 implements depositable{

    public FixedDeposit1(double balance){
        super(balance);
    }
    @Override
    public void deposit(double amount) {
        balance+=amount;
        System.out.println("Fixed Deposit Amount:-"+amount);
    }
}

public class LiskovSubstitution {
    public static void main(String[] args) {
        //Negative
        Account1 ac=new SavingsAccount();
        ac.withdraw(1000);

//        Account1 ac1=new FixedDeposit();
//        ac1.withdraw(100);
        //Positive
          SavingAccount sv=new SavingAccount(100);
          sv.deposit(100);
          sv.withdraw(100);
          sv.showBalance();

          FixedDeposit1 fd=new FixedDeposit1(100);
          fd.deposit(100);
          fd.showBalance();


    }
}
