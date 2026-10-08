package OOPS;

class BankAcc{
    private String holderName;
    private double balance;

    BankAcc(String holderName, double balance){
        this.holderName = holderName;
        setBalance(balance);
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double amount){
        if(amount>=0){
            this.balance = amount;
        } else {
            System.out.println("Invalid Balance: Balance cannot be negative!!");
        }
    }
}

public class encapsulation {
    public static void main (String[] args){
        BankAcc acc = new BankAcc("Shruti", 500);

        acc.setBalance(-100);
        System.out.println(acc.getBalance());

    }
}
