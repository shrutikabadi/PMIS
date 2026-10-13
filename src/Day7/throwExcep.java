package Day7;

import java.util.Scanner;

public class throwExcep {
    public static void main(String[] args){
        System.out.println("Enter age: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a<0){
            throw new IllegalArgumentException("Age cannot be negative..");
        }
        System.out.println("Age: "+a);
    }
}
