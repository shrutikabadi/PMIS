package Day9;

public class casting {
    public static void main(String[] args) {
        //upcasting
        String s = "Hello";
        Object obj = s;
        System.out.println(obj);

        //downcasting
        Object obj2 = "Shruti";
        String s2 = (String) obj2;
        System.out.println(s2);

        //How is downcasting Dangerous
        Object obj3 = 10;
        String s3 = (String) obj3;
        System.out.println(s3);
    }
}
