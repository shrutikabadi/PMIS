package basics;

import java.util.Scanner;

public class average {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.println("Enter 3rd number: ");
        int c = sc.nextInt();
        avg(a,b,c);

    }

    static void avg(int a, int b, int c){
        int avg = (a+b+c) / 3;
        System.out.println("The average is: " + avg);
    }
}
