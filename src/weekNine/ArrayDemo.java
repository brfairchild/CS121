package weekNine;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        String [] model = new String[3];
        String [] make = new String[3];
        int [] years = new int[3];
        Scanner keyboard = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            System.out.println("Enter in your car make: " + (i + 1) + ":");
            make[i] = keyboard.nextLine();
            System.out.println("Enter in your cars years: " + (i + 1) + ":");
            years[i] = Integer.parseInt(keyboard.nextLine());
            System.out.println("Enter your cars model: " + (i + 1) + ":");
            model[i] = keyboard.nextLine();
        }

        System.out.println("The Car Inventory");
        System.out.println("---------------------------");
        System.out.println("Make\tModel\tYears");
        for (int i = 0; i < model.length; i++){
            System.out.println(make[i] +"\t" + model[i] + "\t" + years[i]);
        }
    }
}
