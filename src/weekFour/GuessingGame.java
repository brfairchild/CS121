package weekFour;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        // Generate the random number
        Random rand = new Random();
        int rngNum = rand.nextInt(1,100);
        Scanner keyboard = new Scanner(System.in);
        int usrTries = 0;

        while (true) {
            System.out.println("Guess a number between 1 and 100 or q to quit: ");
            String usrGuess = keyboard.nextLine();
            if (usrGuess.equals("q")) {
                System.out.println("The number was: " + rngNum);
                System.exit(0);
            }else {
                int usrInt = Integer.parseInt(usrGuess);
                if (usrInt > rngNum){
                    usrTries++;
                    System.out.println(usrInt + " is too high, guess again: ");
                }
                if(usrInt < rngNum){
                    usrTries++;
                    System.out.println(usrInt + " is too low, guess again: ");
                }
                else{
                    System.out.println("You guessed the correct number! \nIt took you: " + usrTries + " guesses!");
                    System.exit(0);
                }
            }
        }
    }
}
