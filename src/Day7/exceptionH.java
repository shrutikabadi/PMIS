package Day7;

public class exceptionH {
    public static void main(String[] args){
        int a = 5;
        int b = 0;

        try{
            int[] arr = {10,20,40};
            System.out.println(arr[5]);

            int res = a/b;
            System.out.println("Result: "+res);

        }
        catch (ArithmeticException e){
            System.out.println("You cannot divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid array index");
        }
        finally {
            System.out.println("Finally block executed..");
        }
    }
}
