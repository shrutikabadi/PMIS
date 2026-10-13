package InheritanceJava;

class BankAcc{
    String accountholder;

    BankAcc(String accountholder){
        this.accountholder = accountholder;
    }
    void displayDetails(){
        System.out.println("Account holder: "+ accountholder);
    }
}

class SavingsAcc extends BankAcc{
    double interestRate = 4.5;

    SavingsAcc (String accountholder){
        super(accountholder);
    }
    void displayDetails(){
        System.out.println("Account Holder: "+ accountholder);
        System.out.println("Interest Rate: "+ interestRate+ " %");
    }
}

public class MainBankAcc {
    public static void main(String[] args){
        SavingsAcc sc = new SavingsAcc("Shruti");
        sc.displayDetails();

    }
}
