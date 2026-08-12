import java.util.Scanner;

class student {
    String name;
    int age;
    int rollno;
    double marks;

    void getDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        name = sc.nextLine();

        System.out.println("Enter your age: ");
        age = sc.nextInt();

        System.out.println("Enter your roll number: ");
        rollno = sc.nextInt();

        System.out.println("Enter your marks: ");
        marks = sc.nextDouble();
    } 

    void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollno);
        System.out.println("Marks: " + marks);
    }
}

public class Main {
    public static void main(String[] args) {

        student s = new student();

        s.getDetails();
        s.displayDetails();
    }
}