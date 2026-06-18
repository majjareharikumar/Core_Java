package SOLID.Code;

//All responsibilities in one class
//If any changes required for any method then we need to touch this single class and if any issue then it will effect all the methods
class SingleResponsibility {
    public void createAccount(){
        System.out.println("Account Created");
    }
    public void sendEmail(){
        System.out.println("Email sent");
    }
    public void report(){
        System.out.println("Report Generated");
    }
}

//Dividing each responsibility's into separate class
class Account{
    public void createAccount(){
        System.out.println("Account Created");
    }
}
class Email{
    public void sendEmail(){
        System.out.println("Email sent");
    }
}
class Report{
    public void report(){
        System.out.println("Report Generated");
    }
}

public class SingleResponsibilityEx {
    public static void main(String[] args) {
        SingleResponsibility s=new SingleResponsibility();
        s.createAccount();
        s.sendEmail();
        s.report();

        System.out.println("***********Single responsibility***********");
        Account account=new Account();
        Email email=new Email();
        Report report=new Report();

        account.createAccount();
        email.sendEmail();
        report.report();
    }
}


