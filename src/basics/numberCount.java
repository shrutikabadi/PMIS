package basics;

import java.util.Scanner;

public class numberCount {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        int zero = 0;

        char choice = 'y';
        while(choice == 'y' || choice == 'Y') {

            System.out.println("Enter a number: ");
            int num = sc.nextInt();

            if (num>0){
                positive++;
            } else if (num<0) {
                negative++;
            }
            else {
                zero++;
            }

            System.out.println("Do you want to enter another number? (y/n) ");
            choice = sc.next().charAt(0);
        }

        System.out.println("Positive numbers: "+ positive);
        System.out.println("Negative numbers: "+ negative);
        System.out.println("Zero's: "+ zero);
    }

}
