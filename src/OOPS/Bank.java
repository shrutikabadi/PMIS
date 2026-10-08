package OOPS;

import java.util.Scanner;

class bankManagement{
    int totalBalance;
    int amt;

    Scanner sc = new Scanner(System.in);

    void deposit(){
        System.out.println("Enter the amount to deposit: ");
        int dep = sc.nextInt();

        if (dep>0){
            totalBalance += dep;
            System.out.println("Amount deposited successfully...");
            System.out.println("Current balance: "+ totalBalance);
        }
        else {
            System.out.println("Enter valid amount!!!");
        }

    }

    void checkBalance(){
        System.out.println("Total Balance is: "+ totalBalance);
    }

    void withdraw(){
        System.out.println("Enter the amount to be withdrawn: ");
        int wit = sc.nextInt();

        if (wit>totalBalance){
            System.out.println("Balance is not sufficient");
        } else if (wit<=0) {
            System.out.println("Enter valid amount!!!");
        }else {
            totalBalance -= wit;
            System.out.println("Amount withdrawn successfully...");
            System.out.println("Current balance: "+ totalBalance);
        }
    }

}

public class Bank {
    public static void main(String[] args){
        bankManagement b1 = new bankManagement();
        b1.deposit();
        b1.withdraw();
        b1.checkBalance();
    }
}
