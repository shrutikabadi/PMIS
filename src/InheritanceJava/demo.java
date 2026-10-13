package InheritanceJava;

class bird{
    void eat(){
        System.out.println("Bird is eating..");
    }
}
class sparrow extends bird{
    void eat(){
        System.out.println("Sparrow is eating..");
        super.eat();
    }
}

public class demo {
    public static void main(String[] args){
        sparrow s = new sparrow();
        s.eat();
    }
}
