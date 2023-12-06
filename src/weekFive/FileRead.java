package weekFive;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/brfairchild/IdeaProjects/CS121/src/weekFive/courses.txt");

        try{
            Scanner scanner = new Scanner(file);
            String header = scanner.nextLine();
            while(scanner.hasNextLine()){
                String Line = scanner.next();;
                System.out.println(Line);
            }

        } catch (FileNotFoundException e) {
            System.err.println("FILE NOT FOUND");
        }

    }
}
