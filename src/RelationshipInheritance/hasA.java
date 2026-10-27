package RelationshipInheritance;

class Engine{
    void start(){
        System.out.println("Engine is starting...");
    }
}

class Car{
    private Engine engine;
    Car(){
        this.engine = new Engine();
    }
    void drive(){
        engine.start();
        System.out.println("The car is moving...");
    }
}

public class hasA {
    public static void main(String[] args){
        Car bmw = new Car();
        bmw.drive();
    }
}
