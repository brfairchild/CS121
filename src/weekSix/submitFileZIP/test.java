package weekSix;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // Creating an instance of the car class.
        car Tesla = new car("Tesla","S",2022,20000);
        car Honda = new car("Honda","Civic",2023,35000);
        //Encapsulation
        System.out.println(Honda.getYear());
    }
}
