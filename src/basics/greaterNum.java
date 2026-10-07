package basics;

import java.util.Scanner;

public class greaterNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st num: ");
        int a = sc.nextInt();

        System.out.println("Enter 2nd num: ");
        int b = sc.nextInt();

        largerNum(a, b);

    }
    static void largerNum(int a, int b){
        int ln = (a>b)?a:b;
        System.out.println("The larger num is: "+ ln);
    }
}
