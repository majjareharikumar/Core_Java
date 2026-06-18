package SOLID.Code;

//Here we are forcing child classes to implement unused methods.It is ISP violation
interface BankOperations{
    void deposit(double amount);
    void withdraw(double amount);
    void applyLoan(double amount);
}
class SavingsAccount1 implements BankOperations{

    @Override
    public void deposit(double amount) {
        System.out.println("Deposit amount:-"+amount);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("WithDraw amount:-"+amount);
    }

    @Override
    public void applyLoan(double amount) {
        throw new UnsupportedOperationException("Loan not applicable");
    }
}

//Breaking Interface into multiple interfaces for segregation. So that only required methods we can implement
interface deposit{
    void Deposit(double amount);
}
interface withdraw{
    void Withdraw(double amount);
}
interface applyLoan{
    void ApplyLoan(double amount);
}
//Now Savings account only wants deposit and withdraw .So only implementing that
class SavingsAccount4 implements deposit,withdraw{

    @Override
    public void Deposit(double amount) {
        System.out.println("Deposit Amount:-"+amount);
    }

    @Override
    public void Withdraw(double amount) {
        System.out.println("Withdraw amount:-"+amount);
    }
}

//Loan account want only apply loan method
class LoanAccount implements applyLoan{

    @Override
    public void ApplyLoan(double amount) {
        System.out.println("Loan applied");
    }
}
public class InterfaceSegregation {
    public static void main(String[] args) {
        BankOperations ac=new SavingsAccount1();
        ac.deposit(100);
        ac.withdraw(100);
        //ac.applyLoan(1000);

        SavingsAccount4 sv=new SavingsAccount4();
        sv.Deposit(100);
        sv.Withdraw(100);

        LoanAccount la=new LoanAccount();
        la.ApplyLoan(10000);
    }
}
