package InheritanceJava;

class Shape{
    String color = "Blue";
}

class Circle extends Shape{
    void drawCircle(){
        System.out.println("Drawing a "+color+ " circle.");
    }
}

class Rectange extends Shape{
    void drawRectangle(){
        System.out.println("Drawing a "+color+ " rectangle.");
    }
}



public class heirarchicalInheritance {
    public static void main(String [] args){
        Circle c = new Circle();
        Rectange r = new Rectange();

        c.drawCircle();
        r.drawRectangle();
    }
}
