package RelationshipInheritance;

class Student1{
    String name;
    static String collegeName = " IIT Bombay";

    Student1(String name){
        this.name = name;
    }
    void studColl(){
        System.out.println(name + " is studying in "+ collegeName);
    }
}

public class Staticpractice {
    public static void main(String[] args){
        Student1 stud1 = new Student1("Shruti");
        Student1 stud2 = new Student1("Neha");

        stud1.studColl();
        stud2.studColl();

    }
}
