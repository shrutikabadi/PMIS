package basics;

import java.util.Scanner;

public class HackerankQ {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your English marks: (out of 100)");
        int eng = sc.nextInt();
        System.out.println("Enter your Maths marks: (out of 100)");
        int math = sc.nextInt();
        System.out.println("Enter your Science marks: (out of 100)");
        int sci = sc.nextInt();
        System.out.println("Enter your Social Science marks: (out of 100)");
        int ss = sc.nextInt();
        System.out.println("Enter your Hindi marks: (out of 100)");
        int hin = sc.nextInt();

        int totalMarks = eng + math + sci + ss + hin;
        System.out.println("Total Marks are: " + totalMarks);
        int res = (totalMarks / 500) * 5;
        System.out.println("Percentage are: " + res);

        if (eng < 35 || math < 35 || sci < 35 || ss < 35 || hin < 35) {
            System.out.println("Fail");
        } else if (res >= 85) {
            System.out.println("Distiction!!!");
        } else if (res >= 70 && res <= 85) {
            System.out.println("First Class");
        } else if (res >= 60 && res < 70) {
            System.out.println("Second Class");
        } else if (res >= 50 && res < 60) {
            System.out.println("Pass Class");
        } else if (res < 50) {
            System.out.println("Pass");
        }


        sc.close();
    }
}