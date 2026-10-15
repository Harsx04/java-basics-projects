import java.util.Scanner;

//Calculator Using Methods
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static double add(double a, double b) {
        return a+b;
    }

    public static double sub(double a, double b) {
        return a-b;
    }

    public static double mul(double a, double b) {
        return a*b;
    }

    public static double div(double a, double b) {
        return a/b;
    }

    public static void main(String[] args) {

//        1.Basics
        System.out.println("CALCULATOR");

        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("MENU: " + "\n 1.Addition" + "\n 2.Substraction \n 3.Multiplication \n 4.Division \n 5.Exit");

//      2.read the user’s choice and respond using switch


            System.out.print("Enter your choice : ");
            choice = input.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("You selected Addition");

                    System.out.print("Enter your first number: ");
                    double firstNumber = input.nextDouble();
                    System.out.print("Enter your second number: ");
                    double secondNumber = input.nextDouble();

                    double result = add(firstNumber,secondNumber);
                    System.out.println("Result : " + result);

                    break;
                }

                case 2: {
                    System.out.println("You selected Substraction");

                    System.out.print("Enter your first number: ");
                    double firstNumber = input.nextDouble();
                    System.out.print("Enter your second number: ");
                    double secondNumber = input.nextDouble();

                    double result = sub(firstNumber,secondNumber);
                    System.out.println("Result : " + result);

                    break;
                }

                case 3: {
                    System.out.println("You selected Multiplication ");

                    System.out.print("Enter your first number: ");
                    double firstNumber = input.nextDouble();
                    System.out.print("Enter your second number: ");
                    double secondNumber = input.nextDouble();

                    double result = mul(firstNumber,secondNumber);
                    System.out.println("Result : " + result);

                    break;
                }

                case 4: {
                    System.out.println("You selected Division ");

                    System.out.print("Enter your first number: ");
                    double firstNumber = input.nextDouble();
                    System.out.print("Enter your second number: ");
                    double secondNumber = input.nextDouble();

                    if (secondNumber == 0) {
                        System.out.println("Cannot divide by zero");
                    } else {
                        double result = div(firstNumber,secondNumber);
                        System.out.println("Result : " + result);
                    }
                    break;
                }

                case 5:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        }while(choice!=5);



    }
}