package OOPS;

class CoffeeWallet {

    // Data members
    String name;
    int balance;

    // Constructor
    CoffeeWallet(String name, int initialDeposit) {
        this.name = name;
        this.balance = initialDeposit;
    }

    // Method to add money
    void addFunds(int amount) {
        balance += amount;
        System.out.println("₹" + amount + " added successfully.");
        System.out.println("Current Balance: ₹" + balance);
    }

    // Method to make a purchase
    void purchase(int amount) {

        if (amount <= balance) {
            balance -= amount;

            System.out.println("Purchase successful!");
            System.out.println("Amount spent: ₹" + amount);
            System.out.println("Remaining Balance: ₹" + balance);
        }
        else {
            System.out.println("Insufficient funds!");
            System.out.println("Purchase blocked.");
            System.out.println("Current Balance: ₹" + balance);
        }
    }

    // Method to show account overview
    void showOverview() {
        System.out.println("\n----- Wallet Overview -----");
        System.out.println("Student Name: " + name);
        System.out.println("Current Balance: ₹" + balance);
        System.out.println("---------------------------");
    }
}


public class CampusCoffee {

    public static void main(String[] args) {


        CoffeeWallet wallet = new CoffeeWallet("Shruti", 500);

        wallet.showOverview();

        wallet.addFunds(200);

        wallet.purchase(150);

        wallet.purchase(800);

        wallet.showOverview();
    }
}