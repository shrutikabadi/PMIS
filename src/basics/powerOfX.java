package basics;

import java.util.Scanner;

public class powerOfX {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println("Answer: "+ power(x,n));


    }
    static double power(int x, int n){
        return Math.pow(x, n);
    }

}
