//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    /*    Sum of two integers   --------------------------------------------------------------

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        float a = sc.nextFloat();
        System.out.println("Enter 2nd number: ");
        float b = sc.nextFloat();

        float sum =(float) a+b;
        System.out.println(" The sum is: " + sum);
*/
        /* Convert temp from fahrenheit to celcius  -----------------------------------------------

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temprature in Fahrenheit: ");
        float f = sc.nextFloat();

        float c = (f-32) * 5/9;

        System.out.println("Temprature in celcius is: " + c);
*/
  /*      Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: 1/2/3...../12 ");
        int a = sc.nextInt();

        switch (a){
            case 1: System.out.println("January");
            break;
            case 2: System.out.println("February");
                break;
            case 3: System.out.println("March");
                break;
            case 4: System.out.println("April");
                break;
            case 5: System.out.println("May");
                break;
            case 6: System.out.println("June");
                break;
            case 7: System.out.println("July");
                break;
            case 8: System.out.println("August");
                break;
            case 9: System.out.println("September");
                break;
            case 10: System.out.println("October");
                break;
            case 11: System.out.println("November");
                break;
            case 12: System.out.println("December");
                break;
            default:
                System.out.println("Invalid Input");
        }
*/
 /*       Swap the values of two integer without using auxilliary variable
        int a = 10;
        int b = 5;
        System.out.println("Previous Value of a: " +a);
        System.out.println("Previous Value of b: " +b);
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("Swap value of a: "+a);
        System.out.println("Swap value of b : "+b);

  */

  /*    Convert total number of seconds into hours, mins, and remaining seconds -------------------------------------
    Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the seconds to convert: ");
        long totalseconds = sc.nextLong();

        int hours = totalseconds/3600;
        int minutes = (totalseconds % 3600)/60;
        int seconds = totalseconds % 60;

        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
*/
 /*     Largest no out of three   ---------------------------------------
         int a = 100;
        int b = 80;
        int c = 40;


        if (a>b && a>c){
            System.out.println(a+ " is the largest");
        } else if (b>c) {
            System.out.println(b+ " is the largest");
        }else {
            System.out.println(c + " is the largest");
        }

     //  Using ternary operator
     //  int max = (a>b)?((a>c)?a:c):((b>c)?b:c);
     // sout max;

    */
//   //

/*      Star pattern -----------------------------------------------------

        for (int i = 1; i<=5; i++){
            for (int j = 1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }

*/
      /*  Right angle triangle          --------------------------------------------------
       for (int i = 1; i<=4; i++){
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */
        /* Box Pattern    ----------------------------------------------
         int n = 4;
         int m = 5;
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=m; j++) {
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }
         */
/*  inverted  Right angle triangle
  for (int i = 4; i>=1; i--){
            for (int j = i; j>=1; j--) {
                    System.out.print("* ");
            }
            System.out.println();
        }
 */


    }
}