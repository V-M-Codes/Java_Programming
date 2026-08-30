import java.util.Scanner;

public class StudentResultAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks in Subject 1: ");
        int mark1 = sc.nextInt();

        System.out.print("Enter marks in Subject 2: ");
        int mark2 = sc.nextInt();

        System.out.print("Enter marks in Subject 3: ");
        int mark3 = sc.nextInt();

        int total = mark1 + mark2 + mark3;
        double average = (double) total / 3;
        boolean passed = mark1 >= 40 && mark2 >= 40 && mark3 >= 40;
        boolean distinction = passed && average >= 75;
        boolean specialAward = mark1 >= 90 && mark2 >= 90 && mark3 >= 90;
        System.out.println("\n===== STUDENT RESULT =====");
        System.out.println("Name       : " + name);
        System.out.println("Subject 1  : " + mark1);
        System.out.println("Subject 2  : " + mark2);
        System.out.println("Subject 3  : " + mark3);
        System.out.println("Total      : " + total);
        System.out.println("Average    : " + average);

        if (passed) {
            System.out.print("Result : Passed");
            if (distinction) {
                System.out.print(" With Distinction ");
            }
            if (specialAward) {
                System.out.print("and received Special Award");
            }
            System.out.println();
        } else {
            System.out.println("Result : Failed");
        }

        sc.close();
    }
}