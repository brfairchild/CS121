package NewPackage;

import java.util.HashMap;
import java.util.Scanner;

public class hashMapActivity {
    public static void main(String[] args) {
        HashMap<String,String> author = new HashMap<>();
        addKey(author);
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter key to remove: ");
        String lookUp = keyboard.nextLine();
        removeKey(lookUp,author);
        System.out.println("Enter Key to look up: ");
        lookUp = keyboard.nextLine();
        getTheKey(lookUp, author);

    }

    private static void getTheKey(String lookUp, HashMap<String, String> author) {
        System.out.println(":::::Is the key in the hashmap?:::::\n"+author.containsKey(lookUp));
    }

    private static void removeKey(String lookUp,HashMap<String, String> author) {
        author.remove(lookUp);
        System.out.println(":::::The Remove List is:::::\n" + author);
    }

    private static void addKey(HashMap<String, String> author) {
        author.put("The Hunger Games", "Collins ");
        author.put("The Hatchet", "Paulsen");
        author.put("The Red Pyramid", "Riordan");
        System.out.println(":::::The Full List is:::::\n" +author);
    }
}
