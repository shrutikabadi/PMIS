package Day7;

import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no. : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd no. : ");
        int b = sc.nextInt();

        try{
            int res = a / b;
            System.out.println("Result: "+res);
        } catch (ArithmeticException e){
            System.out.println("The number cannot "+e.getMessage());
        }
        finally {
            System.out.println("Program Executed");
        }
        sc.close();
    }
}