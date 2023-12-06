package weekThree;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int usrNm = Integer.parseInt(keyboard.nextLine());


        if(usrNm %2 == 0){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }
}
