package weekTwo;

import java.util.Scanner;

public class userMath {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        float nm1 = Float.parseFloat(keyboard.nextLine());

        System.out.println("Enter your second number: ");
        float nm2 = Float.parseFloat(keyboard.nextLine());

        //Addition
        float addNm = nm1 + nm2;
        System.out.println(nm1 + " and " + nm2 + " added together is \n" + addNm);

        //Subtraction
        float subNm = nm1 - nm2;
        System.out.println(nm1 + " and " + nm2 + " subtracted from each other is \n" + subNm);

        //Multiplication
        float mltNm = nm1 * nm2;
        System.out.println(nm1 + " and " + nm2 + " multiplied together is \n" + mltNm);

        //Division
        float divNm = nm1 / nm2;
        System.out.println(nm1 + " and " + nm2 + " divided by each-other is \n" + divNm);

        //Sqrt
        float sqrtNm = addNm / 2;
        System.out.println("The sqrt of " + nm1 + " and " + nm2 + " is \n" + sqrtNm);

        //Power
        double powNm = Math.pow(nm1,nm2);
        System.out.println("The power of " + nm1 + " and " + nm2 + " is \n" + powNm);

        //Log
        double logNm = Math.log(addNm);
        System.out.println("The log of " + nm1 + " and " + nm2 + " is \n" + logNm);

    }
}
