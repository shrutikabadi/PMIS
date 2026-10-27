package basics;

import java.util.Scanner;

public class oddNum {
   public static void main (String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number by which you want the sum: ");
       int a = sc.nextInt();
       sumOfOddNum(a);
   }
   static void sumOfOddNum(int a){
       int n = a*a;
       System.out.println("Sum of first "+ a +" odd numbers is: " + n);
   }

}
