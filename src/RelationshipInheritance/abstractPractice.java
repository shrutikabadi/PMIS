package RelationshipInheritance;

import org.w3c.dom.css.Rect;

abstract class Shape{
    private String color;

    void setColor(String color){
        this.color = color;
    }
    String getColor(){
        return color;
    }
    abstract double calculateArea();
}

class Circle extends Shape{
    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return (3.14) * radius * radius;
    }
}

class Rectangle extends Shape{
    double length, breadth;

    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double calculateArea() {
        return length * breadth;
    }
}

public class abstractPractice {
    public static void main(String[] args){
        Shape c = new Circle(5);
        Shape r = new Rectangle(4, 6);

        c.setColor("Blue");
        r.setColor("Red");

        System.out.println("Circle Color: " + c.getColor());
        System.out.println("Circle Area: " + c.calculateArea());

        System.out.println("Rectangle Color: " + r.getColor());
        System.out.println("Rectangle Area: " + r.calculateArea());

    }
}
