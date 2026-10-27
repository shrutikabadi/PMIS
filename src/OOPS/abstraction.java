package OOPS;

abstract class PaymentGateway{
    void printReceipt(){
        System.out.println("Receipt generated.. ");
    }
    abstract void processPayment(double amount);
}

class UPIPayment extends PaymentGateway{
    @Override
    void processPayment(double amount) {
        System.out.println("Processing " + amount+ " via UPI QR Code");
        }
}
class CreditCardPayment extends PaymentGateway{
    @Override
    void processPayment(double amount) {
        System.out.println("Processing "+amount+" via Card Swipe and OTP.");
    }
}

public class abstraction {
    public static void main(String[] args){
        PaymentGateway pg = new UPIPayment();
        pg.processPayment(250.0);
        pg.printReceipt();



    }
}
