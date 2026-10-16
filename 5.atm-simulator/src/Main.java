//ATM Simulator\
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("ATM Simulator");
        Scanner input = new Scanner(System.in);

//      Use a fixed PIN for this learning simulation.
        String correctPin = "1234";

        int attempts = 0;
        boolean loggedIn = false;

        while (attempts < 3) {
            System.out.print("Enter your PIN: ");
            String enteredPin = input.nextLine();
            attempts++;

            if (enteredPin.equals(correctPin)) {
                loggedIn = true;
                System.out.println("Login successful!");
                break;
            } else {
                System.out.println("Incorrect PIN.");
            }
        }

        // Prevent access to the ATM menu after three unsuccessful attempts.
        if (!loggedIn) {
            System.out.println("Too many incorrect attempts. Session ended.");
            return;
        }

        // Keep the balance outside the loop so it persists between menu choices.
        double balance = 1000.0;
        int choice;

        do {
            System.out.println("\n----- ATM MENU -----");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Available balance: " + balance);
                    break;

                case 2: {
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = input.nextDouble();

                    if (depositAmount <= 0) {
                        System.out.println("Deposit amount must be greater than zero.");
                    } else {
                        // Update the existing balance so later transactions use it.
                        balance += depositAmount;

                        System.out.println("Deposit successful!");
                        System.out.println("Available balance: " + balance);
                    }

                    break;
                }

                case 3: {
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = input.nextDouble();

                    if (withdrawalAmount <= 0) {
                        System.out.println("Withdrawal amount must be greater than zero.");
                    } else if (withdrawalAmount > balance) {
                        System.out.println("Insufficient balance.");
                    } else {
                        // Deduct money only after both validation checks pass.
                        balance -= withdrawalAmount;

                        System.out.println("Withdrawal successful!");
                        System.out.println("Available balance: " + balance);
                    }

                    break;
                }

                case 4:
                    System.out.println("Thank you. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Select 1 to 4.");
            }
        } while (choice != 4);

    }
}