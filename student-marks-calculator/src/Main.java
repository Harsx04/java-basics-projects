// Student Marks Calculator

import java.util.Scanner; //Predefine Scanner class

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // create an object of that imported Scanner class

        String choice;
        do{
            //1.Enter Student Details
            System.out.print("Enter student name : ");
            String studentName = input.nextLine(); // to store name we took String datatype and because name has firstname and lastname to read the line we take nextLine
            System.out.println("Hello" + " " + studentName);

            //2.input marks of all the subject from student

            //Math
            System.out.print("Enter Math Marks : ");
            int mathMarks = input.nextInt();//using nextInt we will store the math marks in mathMarks variable
            //Validate Maths marks
            while (mathMarks < 0 || mathMarks > 100) {
                System.out.println("Math Marks must be between 0 and 100");
                System.out.println("Enter Marks again :");
                mathMarks = input.nextInt(); //We don’t write int again because the variable already exists. We’re updating its value.
            }

            //English
            System.out.print("Enter English Marks : ");
            int englishMarks = input.nextInt();
            //Validate English marks
            while (englishMarks < 0 || englishMarks > 100) {
                System.out.println("Math Marks must be between 0 and 100");
                System.out.println("Enter Marks again :");
                englishMarks = input.nextInt(); //We don’t write int again because the variable already exists. We’re updating its value.
            }

            //Science
            System.out.print("Enter Science Marks : ");
            int scienceMarks = input.nextInt();
            //Validate Science marks
            while (scienceMarks < 0 || scienceMarks > 100) {
                System.out.println("Math Marks must be between 0 and 100");
                System.out.println("Enter Marks again :");
                scienceMarks = input.nextInt(); //We don’t write int again because the variable already exists. We’re updating its value.
            }

            //Hindi
            System.out.print("Enter Hindi Marks : ");
            int hindiMarks = input.nextInt();
            //Validate Hindi marks
            while (hindiMarks < 0 || hindiMarks > 100) {
                System.out.println("Math Marks must be between 0 and 100");
                System.out.println("Enter Marks again :");
                hindiMarks = input.nextInt(); //We don’t write int again because the variable already exists. We’re updating its value.
            }

            //Computer
            System.out.print("Enter Computer Marks : ");
            int computerMarks = input.nextInt();
            //Validate Computer marks
            while (computerMarks < 0 || computerMarks > 100) {
                System.out.println("Math Marks must be between 0 and 100");
                System.out.println("Enter Marks again :");
                computerMarks = input.nextInt(); //We don’t write int again because the variable already exists. We’re updating its value.
            }

//        3.Calculate the total
            int totalMarks = mathMarks + englishMarks + scienceMarks + hindiMarks + computerMarks;
            System.out.println("Total Marks out of 500 : " + totalMarks);

//        4.Calculate the percentage
            double percentage = (totalMarks / 500.0) * 100; //Why 500.0 instead of 500? When Java divides two integers, it discards the fractional part. Using 500.0 makes this a decimal calculation. double stores the decimal result.
            System.out.println("Percentage : " + percentage + "%");

//        5.Add Passing Rule
            if (mathMarks >= 35 && scienceMarks >= 35 && englishMarks >= 35 && computerMarks >= 35 && hindiMarks >= 35) {
                System.out.println("Result: PASS");
                if (percentage >= 90) {
                    System.out.println("Grade: A");
                } else if (percentage >= 80) {
                    System.out.println("Grade: B");
                } else if (percentage >= 70) {
                    System.out.println("Grade: C");
                } else if (percentage >= 60) {
                    System.out.println("Grade: D");
                } else {
                    System.out.println("Grade: E");
                }
            } else {
                System.out.println("Result: FAIL");
                System.out.println("Grade: F");
                System.out.println("You must score at least 35 in every subject to pass.");
            }
            input.nextLine(); // Consume the newline left by nextInt()

            System.out.print("Calculate for another student? (yes/no): ");
            choice = input.nextLine();

        }while(choice.equalsIgnoreCase("yes/no"));{
            System.out.println("Thank you for using the calculator!");
        }
    }
}