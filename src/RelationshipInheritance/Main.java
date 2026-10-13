package RelationshipInheritance;

class Address{
    String city;
    String state;
    int pincode;

    Address(String city, String state, int pincode){
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }
    void displayAddress(){
        System.out.println(city+", "+state+", "+pincode);
    }
}

class Student{
    String name;
    int rollNum;
    Address address;

    Student(String name, int rollNum, Address address){
        this.name = name;
        this.rollNum = rollNum;
        this.address = address;
    }
    void displayProfile(){
        System.out.println("Student: "+name+"\nRoll No.: "+rollNum);
        System.out.print("Address: ");
        address.displayAddress();
    }
}

public class Main {
    public static void main(String[] args){
        Address home = new Address("Mumbai", "Maharashtra", 400501);
        Student stu = new Student("Shruti", 24, home);

        stu.displayProfile();
    }
}
