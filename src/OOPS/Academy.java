package OOPS;

class StudentProfile {

    String name;
    int studentId;
    double score;

    // Constructor 1: Student who already has a score
    StudentProfile(String name, int studentId, double score) {
        this.name = name;
        this.studentId = studentId;
        this.score = score;
    }

    // Constructor 2: Walk-in student
    StudentProfile(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.score = 0.0;
    }

    // Method to calculate grade
    char getGrade() {

        if (score >= 90) {
            return 'A';
        }
        else if (score >= 75) {
            return 'B';
        }
        else if (score >= 50) {
            return 'C';
        }
        else {
            return 'F';
        }
    }

    // Method to print report card
    void printReportCard() {

        System.out.println("\n===== STUDENT REPORT CARD =====");
        System.out.println("Name       : " + name);
        System.out.println("Student ID : " + studentId);
        System.out.println("Score      : " + score);
        System.out.println("Grade      : " + getGrade());
        System.out.println("===============================");
    }
}


public class Academy {

    public static void main(String[] args) {

        // Student who has already taken the entrance exam
        StudentProfile student1 =
                new StudentProfile("Shruti", 101, 82.5);

        // Walk-in student who has no score
        StudentProfile student2 =
                new StudentProfile("Rahul", 102);

        // Print both report cards
        student1.printReportCard();
        student2.printReportCard();
    }
}
