package weekNine;

import java.util.Arrays;

public class MovieBookingSimulation {
    public static void main(String[] args) {
        // theater 5 rows : 10 seats per row.
        // 0 is ava 1 is taken.
        int [] [] theater = new int [5][10];
        for (int i = 0; i < 5; i++){
            for (int x = 0; x < 10; x++){
                theater[i][x] = 0;
            }
        }

        // Setting up movie info
        String [][] movieInfo = {
                // Name    3D/2D   Seats Ava.   Price
                {"Iron Man", "3D", "20", "$15"},
                {"Shrek 2", "3D", "15", "$9.50"},
                {"Speedracer", "2D", "15", "12.75"}
        };

        // Printing the initial theater seats
        System.out.println("AVAILABLE SEATS: ");
        System.out.println("===========================");

        // Logic for setting each of the seats in the theater.
        int l = 0;
        for(int y = 0; y < 5; y++){
            // testing to make sure that the length is correct.
            //l = l + 1;
            for(int z = 0; z < 10; z++){
                if(l == 10){
                    System.out.printf("\n");
                    l = 0;
                }
                l = l +1;
                // initial prints
                System.out.print(theater[y][z]);
                }
        }

        System.out.println("\n===========================");

        // print out movie details
        System.out.println("MOVIES PLAYING:");
        int q = 0;
        int counter = 12;
        int w = 0;
        String currentMovie = "";

        if (counter >= 0){
            currentMovie = movieInfo[q][w];
            w = w + 1;
            counter = counter -1;
        }
        System.out.println(currentMovie);

    }
}
