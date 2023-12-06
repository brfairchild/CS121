package weekThree;

import javax.swing.*;

public class RestaurantSelector {
    public static void main(String[] args) {
        // Getting user input
        String usrIsVeg = JOptionPane.showInputDialog(null,"Is anyone in the part a vegetarian?");
        String usrIsVegan = JOptionPane.showInputDialog(null,"Is anyone in the part a vegan?");
        String usrGlutFree = JOptionPane.showInputDialog(null,"Is anyone in the part a gluten-free?");


        // Setting up booleans, just setting the default values to false so that it defaults to no.
        boolean usrVeg = false;
        boolean usrVegan = false;
        boolean userGlut = false;


        // Setting certain booleans to true based on user input.
        if(usrIsVeg.equals("yes")){
            usrVeg = true;
        }
        if(usrIsVegan.equals("yes")){
            usrVegan = true;
        }
        if(usrGlutFree.equals("yes")){
            userGlut = true;
        }


        // Running through the conditions
        if (userGlut && usrVegan && usrVeg){
            JOptionPane.showMessageDialog(null,"This list of restaurants available: \n      Corner Cafe \n      The Chef's Kitchen");
        } else if (!userGlut && !usrVegan && !usrVeg) {JOptionPane.showMessageDialog(null,"This list of restaurants available: \n      Joe’s Gourmet Burgers \n      Main Street Pizza Company \n      Corner Café \n      Mama’s Fine Italian \n      The Chef’s Kitchen");
        } else if (userGlut && usrVeg && !usrVegan) {JOptionPane.showMessageDialog(null,"This list of restaurants available: \n      Main Street Pizza Company \n       Corner Café \n      The Chef’s Kitchen");
        } else if (userGlut && !usrVeg && !usrVegan) {JOptionPane.showMessageDialog(null,"This list of restaurants available: \n      Main Street Pizza Company \n        The Chef’s Kitchen");
        } else if (!userGlut && usrVeg && !usrVegan) {JOptionPane.showMessageDialog(null,"This list of restaurants available: \n      Main Street Pizza Company \n       Corner Café \n      Mama’s Fine Italian \n      The Chef’s Kitchen ");
        } else if (!userGlut && !usrVeg && usrVegan) {JOptionPane.showMessageDialog(null,"This list of restaurants available: \n     Corner Café \n        The Chef’s Kitchen");
        } else if (userGlut && !usrVeg && usrVegan) {JOptionPane.showMessageDialog(null,"This list of restaurants available: \n     Corner Café \n        The Chef’s Kitchen");}
    }
}
