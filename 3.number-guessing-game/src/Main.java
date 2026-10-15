//Number Guessing Game

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("Number Guessing Game");
        Scanner input = new Scanner(System.in);

        Random random = new Random();
        int secretNumber = random.nextInt(100)+1;
//How it works:
//- random.nextInt(100) generates an integer from 0 through 99.
//- Adding 1 shifts that range to 1 through 100.
        int attempts = 0;
        boolean guessedCorrectly = false;

        while(attempts<7) {
            System.out.print("Enter your guess (1–100):");
            int guess = input.nextInt();

            attempts++;

            if(guess>secretNumber) {
                System.out.println("Too High!");
            }else if(guess<secretNumber) {
                System.out.println("Too Low!");
            }else{
                guessedCorrectly = true;
                System.out.println("Correct! You guessed it in " + attempts + " attempts.");
                break;
            }
        }
        if(!guessedCorrectly){
            System.out.println("You lost! The secret number was " + secretNumber);
        }

    }
}