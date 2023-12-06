package weekTwo;

import javax.swing.*;

public class userName {
    public static void main(String[] args) {
        String fName = JOptionPane.showInputDialog("Enter your first and last name: ");

        //Method found on stack overflow
        StringBuilder rName = new StringBuilder();
        rName.append(fName);
        rName.reverse();

        JOptionPane.showMessageDialog(null,"Hello " + fName.toUpperCase()+ "\n" + fName.toLowerCase() +"\n" + rName);


    }
}
