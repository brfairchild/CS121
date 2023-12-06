package weekFour;

import java.util.Random;
import java.util.Scanner;

public class ESPGame {
    public static void main(String[] args) {

        // 0 = Red
        // 1 = Green
        // 2 = Blue
        // 3 = Orange
        // 4 = Yellow


        // Declaring everything

        Scanner keyboard = new Scanner(System.in);
        int usrGuess = 0;
        int gameCount = 1;
        int guessCount = 1;
        int winCon = 0;



        while (gameCount <= 10){
            // Building a switch case for the colors
            Random rand = new Random();
            int rngNum = rand.nextInt(0,4);
            String rngStr = String.valueOf(rngNum);
            String colorNum = switch (rngStr){
                case "0" -> "red";
                case "1" -> "green";
                case "2" -> "blue";
                case "3" -> "orange";
                case "4" -> "yellow";
                default -> "Error";
            };
            System.out.println("What color has the computer picked?");
            String usrColor = keyboard.nextLine();
            if(usrColor.equals(colorNum)){
                System.out.println("Correct!");
                winCon++;
            }else{guessCount++;System.out.println("The computer has picked " + colorNum);}
            gameCount++;
        }
        if(gameCount>=10){
            System.out.println("You got " + winCon + " out of 10 colors correct.");
        }

    }
}
