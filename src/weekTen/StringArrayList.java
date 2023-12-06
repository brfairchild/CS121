package weekTen;

import java.util.ArrayList;
import java.util.Scanner;

public class StringArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add(0, "Ben");
        names.add(1, "Robin");
        names.add(2, "Charlie");
        System.out.println(names);
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a name to add to the list: ");
        String name = keyboard.nextLine();
        names.add(1,name);
        System.out.println(names);
        System.out.println("Now lets remove a string from the list: ");
        names.remove(0);
        System.out.println(names);
        String sizeOfNames = String.valueOf(names.size());
        System.out.println("The current size of the string is: "+sizeOfNames);
        String firstName = String.valueOf(names.get(0));
        System.out.println("The element in index 0 is: "+firstName);
        
        // For loop
        System.out.println("For loop");
        for (int i =0; i < names.size(); i++){
            System.out.println(names.get(i));
        }

        System.out.println("=========================");

        System.out.println("For each loop");
        // For each loop
        for (String z : names) {
            System.out.println(z);
        }

    }

}
