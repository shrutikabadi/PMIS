package InheritanceJava;

class Animal{
    void eat(){
        System.out.println("Thre animal eats food..");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("The dog barks..");
    }

        }
public class practisingInheritance {
    public static void main(String[] args){

        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}
