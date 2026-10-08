package OOPS;

class Calculator{
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
}
class Animal{
    void makeSound(){
        System.out.println("Animal makes a sound ");
    }
}
class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Dog barks: Woof Woof");
    }
}
class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("Cat barks: Meow Meow");
    }
}

public class polymorphism {
    public static void main(String[] args) {

        Animal pet1 = new Dog();
        Animal pet2 = new Cat();
        Animal pet3 = new Animal();

        pet1.makeSound();
        pet2.makeSound();
        pet3.makeSound();
    }
}
