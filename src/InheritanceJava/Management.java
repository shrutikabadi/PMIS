package InheritanceJava;

class Employee{
    double salary;
}

class Manager extends Employee {
    double salary = 60000;

    void displaySalary() {
        System.out.println("Manager Salary: " + salary);
        System.out.println("Employee Salary: " + super.salary);
    }
}
    public class Management {
        public static void main(String[] args) {
            Manager m1 = new Manager();
            m1.displaySalary();
        }
    }
