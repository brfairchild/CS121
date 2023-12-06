package weekTwo;


import java.util.Scanner;

public class intergerDiv {
    public static void main(String[] args) {


        // Set up for keyboard input.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your name?");
        String firstName = keyboard.nextLine();
        System.out.println(firstName);


        System.out.println("What is your age?");
        int age = Integer.parseInt(keyboard.nextLine());
        System.out.println(age);

        System.out.println("What is your GPA?");
        double gpa = Double.parseDouble(keyboard.nextLine());
        System.out.println(gpa);




        int numOne = 1;
        int numTwo = 4;
        double results = (double)numOne / numTwo;
        System.out.println(results);


        String name = "Robin";
        name.concat("Tilfred");
        System.out.println(name);


    }
}