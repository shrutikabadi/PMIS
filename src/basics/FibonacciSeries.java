package basics;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main (String[] args){
        int num1 = 0;
        int num2 = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.print(num1+" ");

            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }


    }
}
