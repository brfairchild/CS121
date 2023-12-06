package weekThree;

import javax.swing.*;

public class Triangles {
    public static void main(String[] args) {
        String usrSide1 = JOptionPane.showInputDialog("Enter the first side of your triangle: ");
        String usrSide2 = JOptionPane.showInputDialog("Enter the second side of your triangle: ");
        String usrSide3 = JOptionPane.showInputDialog("Enter the third side of your triangle: ");

        float usr1 = Float.parseFloat(usrSide1);
        float usr2 = Float.parseFloat(usrSide2);
        float usr3 = Float.parseFloat(usrSide3);

        if (usr1 == usr2 && usr1 == usr3){
            JOptionPane.showMessageDialog(null,"This is a Equilateral Triangle");
        }

        if (usr1 != usr2 && usr1 != usr3 && usr2 != usr3){
            JOptionPane.showMessageDialog(null,"This is a Scalene triangle");
        }

        if (usr1 == usr2 && usr1 != usr3){
            JOptionPane.showMessageDialog(null,"This is a Isosceles triangle");
        }
        if (usr2 == usr3 && usr2 != usr1){
            JOptionPane.showMessageDialog(null,"This is a Isosceles triangle");
        }




    }
}
