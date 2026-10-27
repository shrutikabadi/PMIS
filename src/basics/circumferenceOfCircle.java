package basics;

import java.util.Scanner;

public class circumferenceOfCircle {
    public static  void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        double a = sc.nextDouble();

        coc((int) a);

    }
    static void coc(int a){
        double circumference = 2 * 3.14 * a;
        System.out.println("The circumference of circle is: "+ circumference);

    }
}
