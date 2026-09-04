 import java.util.Scanner;

public class BankAccountManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String studentName = "";
        int studentID = 0;
        long accountNumber = 0;
        double balance = 0;
        double initialAmount = 0;
        double interest = 0;
        double rate = 0.05;

        System.out.println("1. Create an Account");
        System.out.println("2. Login to your account");
        System.out.println("Enter your choice: ");

        int choice = sc.nextInt();
      sc.nextLine();

        switch (choice) {

            case 1:

                System.out.println("Enter the following details to create an account:\n");

                System.out.println("Student Name: ");
                studentName = sc.nextLine();

                System.out.println("Student ID: ");
                studentID = sc.nextInt();

                System.out.println("Account Number: ");
                accountNumber = sc.nextLong();

                System.out.println("Initial Deposit Amount (must be > ₹0): ");
                initialAmount = sc.nextDouble();

                balance = initialAmount;

                System.out.println("Account Created Successfully");
                break;

            case 2:

                System.out.println("Login selected.");
                break;

            default:

                System.out.println("Invalid choice.");
                return;
        }


        while (true) {

            System.out.println("\n============== STUDENT BANK SYSTEM ==============");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Display Account Details");
            System.out.println("5. Calculate Interest");
            System.out.println("6. Exit");

            System.out.println("Enter your choice: ");
            int choiceno = sc.nextInt();


            if (choiceno == 1) {

                System.out.println("Enter the amount to be deposited (> ₹0): ");
                double depositAmount = sc.nextDouble();

                if (depositAmount > 0) {

                    balance += depositAmount;

                    System.out.println("Amount deposited successfully.");
                    System.out.println("Current balance: ₹" + balance);

                } else {

                    System.out.println("ERROR: Deposit amount must be greater than ₹0.");
                }


            } else if (choiceno == 2) {

                System.out.println("Enter the amount to be withdrawn (> ₹0): ");
                double withdrawAmount = sc.nextDouble();

                if (withdrawAmount <= 0) {

                    System.out.println("ERROR: Withdrawal amount must be greater than ₹0.");

                } else if (withdrawAmount <= balance) {

                    balance -= withdrawAmount;

                    System.out.println("Amount withdrawn successfully.");
                    System.out.println("Current balance: ₹" + balance);

                } else {

                    System.out.println("ERROR: Insufficient balance.");
                }


            } else if (choiceno == 3) {

                System.out.println("Current balance: ₹" + balance);


            } else if (choiceno == 4) {

                System.out.println("Account Details:");
                System.out.println("Student Name    : " + studentName);
                System.out.println("Student ID      : " + studentID);
                System.out.println("Account Number  : " + accountNumber);
                System.out.println("Balance         : ₹" + balance);


            } else if (choiceno == 5) {

                System.out.println("Enter the time period in years: ");
                double time = sc.nextDouble();

                interest = balance * rate * time;

                System.out.println("Interest earned: ₹" + interest);
                System.out.println("New Balance : ₹" + (balance + interest));


            } else if (choiceno == 6) {

                System.out.println("Thank you for using the Student Bank System!");

                break;


            } else {

                System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
    }
}