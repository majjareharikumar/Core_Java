package SOLID.Code;
interface AccountRepo{
    void saveAccount();
}

class MySql implements AccountRepo{

    @Override
    public void saveAccount() {
        System.out.println("Saved account in MySQL");
    }
}

class Oracle implements AccountRepo{

    @Override
    public void saveAccount() {
        System.out.println("Saved account in oracle");
    }
}

class AccountService{
    private AccountRepo accountRepo;
     AccountService(AccountRepo accountRepo){
        this.accountRepo=accountRepo;
    }
    public void createAccount(){
        accountRepo.saveAccount();
    }
}
public class DependencyInversion {
    public static void main(String[] args) {
        AccountRepo mysql=new MySql();

        AccountService as=new AccountService(mysql);
        as.createAccount();

        AccountRepo oracle=new Oracle();
        AccountService as1=new AccountService(oracle);
        as1.createAccount();
    }
}
