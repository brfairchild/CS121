package weekTwo;

import javax.swing.*;
import java.util.Scanner;

public class WordGame {
    public static void main(String[] args) {

        // Name
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = keyboard.nextLine();

        // Age
        System.out.println("What is your age?");
        int age = Integer.parseInt(keyboard.nextLine());

        // City
        System.out.println("What city are you from?");
        String city = keyboard.nextLine();

        // College
        System.out.println("What college are you in?");
        String college = keyboard.nextLine();

        // Major
        System.out.println("What is your major?");
        String major = keyboard.nextLine();

        // Animal Type
        System.out.println("What type of animal do you have?");
        String amlType = keyboard.nextLine();

        // Animal Name
        System.out.println("What is your pets name?");
        String petName = keyboard.nextLine();



        /*

        System.out.println(name);
        System.out.println(age);
        System.out.println(city);
        System.out.println(college);
        System.out.println(major);
        System.out.println(amlType);
        System.out.println(petName);

        */


        System.out.printf("There once was a person named %s who lived in %s.\nAt the age of %s, %s went to college at %s. %s graduated with a %s.\nThen, %s adopted a(n) %s named %s.\nThey both lived happily ever after!", name, city, age, name, college, name, major, name,amlType,petName);


    }
}