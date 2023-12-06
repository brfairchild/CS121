package weekThree;

import javax.swing.*;

public class Login {
    public static void main(String[] args) {
        String truNm = "cs121";
        String truPw = "password";
        String usrNm = JOptionPane.showInputDialog("Enter your username: ");
        String usrPw = JOptionPane.showInputDialog("Enter your password: ");

        if(usrNm.equals(truNm) && usrPw.equals(truPw)){
            JOptionPane.showMessageDialog(null,"Welcome to CS121");
        } else if (!usrNm.equals(truNm) && usrPw.equals(truPw)) {
            JOptionPane.showMessageDialog(null,"Wrong username entered :(");
        } else if (!usrPw.equals(truPw) && usrNm.equals(truNm)) {
            JOptionPane.showMessageDialog(null,"Wrong password entered :(");
        } else {
            JOptionPane.showMessageDialog(null,"Wrong username and password entered :(");

        }




    }
}
