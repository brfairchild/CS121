package weekTwo;

import javax.swing.*;

public class strings {
    public static void main(String[] args) {
        String name = "Robin";
        //.concat
        name.concat("Tilfred");
        System.out.println(name);

        name = name.concat("Tilfred");
        System.out.println(name);

        //.length
        System.out.println(name.length());

        //.charAt
        System.out.println(name.charAt(4));

        //.replace
        System.out.println(name.replace("Robin","Jacob"));

        //.substring
        System.out.println(name.substring(0));
        System.out.println(name.substring(0,1));
        System.out.println(name.substring(0,3));

        String fName = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null,"You Entered: " + fName);

        //int
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        JOptionPane.showMessageDialog(null,"You Entered: " + age);

        //double
        double gpa = Double.parseDouble(JOptionPane.showInputDialog("Enter your GPA: "));
        JOptionPane.showMessageDialog(null,"You have entered: " + gpa);


    }
}
