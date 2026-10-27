package basics;

import java.util.Scanner;

public class Age {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age =  sc.nextInt();

        if (eligibleToVote(age)){
            System.out.println("Eligible to vote");
        }
        else {
            System.out.println("Not eligible to vote");
        }
    }

    static boolean eligibleToVote(int a){
        if(a>=18)
            return true;
        else
            return false;
    }
}
