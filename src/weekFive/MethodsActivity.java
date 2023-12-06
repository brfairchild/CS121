package weekFive;

import java.util.Scanner;


public class MethodsActivity {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double recLen=0;
        double recWid=0;
        getLength();
        getWidth();
        getArea(recLen,recWid);


        scanner.close();
    }

    public static double getLength(){
        System.out.println("Enter the length of the rectangle: ");
        double recLen = Double.parseDouble(scanner.nextLine());
        return recLen;
    }
    public static double getWidth(){
        System.out.println("Enter the width of the rectangle: ");
        double recWid = Double.parseDouble(scanner.nextLine());
        return recWid;
    }

    public static void getArea(double recLen, double recWid) {
        double recArea = recLen * recWid;
        displayData(recArea);
    }

    public static void displayData(double recArea){
        System.out.println(recArea);
    }
}
