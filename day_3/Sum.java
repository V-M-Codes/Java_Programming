import java.util.Scanner;
class add {
    int a;
    int b;
    int sum;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        a = sc.nextInt();
        System.out.println("Enter second number: ");
        b = sc.nextInt();
        sum = a + b;
    }

    void displayData() {
        System.out.println("Sum of the above numbers are : " + sum);
    }
}

    public class Sum {
        public static void main(String[] args){
            add no = new add();
            no.getData();
            no.displayData();
        }
    }