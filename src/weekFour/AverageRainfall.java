package weekFour;

import java.util.Scanner;

public class AverageRainfall {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the number of years: ");

        int yearNm = Integer.parseInt(keyboard.nextLine());
        double inchMonth = 0;


        for(int x = 1; x<=yearNm;){
            for(int i =1; i<=12; i++){
                System.out.println("Enter rain fall for year "+x+ " month "+i);
                inchMonth = inchMonth + Double.parseDouble(keyboard.nextLine());
            }
            x++;
        }


        int monthCount = yearNm * 12;
        double avgCount = inchMonth/monthCount;


        System.out.println("Number of months: "+monthCount);
        System.out.println("Total inches of rainfall: " + inchMonth);
        System.out.println("Average amount of rainfall for " +yearNm+" years: "+avgCount);
    }
}
