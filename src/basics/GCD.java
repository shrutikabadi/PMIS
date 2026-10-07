package basics;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GCD {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = sc.nextInt();

        int n = Math.max(a, b);

        int gcd = 0;
        for (int i = 1; i <= n; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        System.out.println("GCD: " + gcd);
    }
    }

