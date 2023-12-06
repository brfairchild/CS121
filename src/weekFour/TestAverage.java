package weekFour;

import javax.swing.*;

public class TestAverage {
    public static void main(String[] args) {
        int numStudents = Integer.parseInt(JOptionPane.showInputDialog("How many students are there?"));
        double numTests = Double.parseDouble(JOptionPane.showInputDialog("How many tests did each student have?"));
        double avgScore = 0;
        for (int i = 1; i <= numStudents; i++){
            double testScore = 0;
            for (int x = 1; x <= numTests; x++){
                testScore = testScore + Double.parseDouble(JOptionPane.showInputDialog("Enter score for test "+x+" for student "+i));
                avgScore = testScore / numTests;
            }
            JOptionPane.showMessageDialog(null,"The average for student " + i + " is\n" + avgScore);
        }
    }
}
