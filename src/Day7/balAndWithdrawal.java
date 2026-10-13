package Day7;

import org.w3c.dom.ls.LSOutput;

public class balAndWithdrawal {
    public static void main(String[] args) {
        int bal = 15000;
        int withdrawal = 6000;

        try {
            if (bal < withdrawal) {
                throw new IllegalArgumentException("Insufficient Balance");
            }
            bal -= withdrawal;
            System.out.println("Withdrawal was successful...");
            System.out.println("Remaining balance: " + bal);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Program completed..");
    }
}
