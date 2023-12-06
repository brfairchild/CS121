package weekFive;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/brfairchild/IdeaProjects/CS121/src/weekFive/courses.txt");

        try {
            // Reading the file
            Scanner scanner = new Scanner(file);
            String header = scanner.next();
            while (scanner.hasNextLine()) {

            // Writing the file
                String course = scanner.next();
                int credits = Integer.parseInt(scanner.next());
                int score = Integer.parseInt(scanner.next());
                System.out.printf("%-7s %3d %7d\n",course,credits,score);

            }
        }catch(FileNotFoundException e){
            // Throwing error if cant find file.
            System.err.println("===FILE NOT FOUND===");
        }
    }
}
