package weekFour;

import java.util.Scanner;

public class whileLoops {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        // while(condition) {code}
        // do { code
        // }while(condition)

        // While Loop
        int num = 0;
        String course = console.nextLine();
        // while(num <= 5){
        //     System.out.println("the number is: " + num);
        //     num++;
        // }

        // Do While Loop
        // do{
        //     System.out.println("the number is: " + num);
        //     num++;
        // }while(num<=5);

        // While true
        while (true){
            System.out.println("Enter course of Q to quit: ");
            if(course.equals("q")){
                break;
            }
            else {
                System.out.println(course);
            }
        }
    }
}
