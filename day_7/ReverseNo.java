import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        long num = sc.nextLong();
        long rev = 0;
        while (num != 0){
            long rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        System.out.println("The reversed number is: " + rev);
    }

}