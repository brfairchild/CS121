package weekThree;

import javax.swing.*;

public class SwitchActivity {
    public static void main(String[] args) {
        String usrPlanet = JOptionPane.showInputDialog("Enter the name of one of the planets: ");
        String expressPlan = switch(usrPlanet){
            case "earth" -> "Earth: \nSize: 196.9 million mi² \nDistance from Sun: 93.7 million mi.";
            case "mercury" -> "Mercury: \nSize: 3,032 mi \nDistance from Sun: 34.866 million mi.";
            case "venus" -> "Venus: \nSize: 7,521 mi\nDistance from Sun: 67.547 million mi.";
            case "mars" -> "Mars: \nSize: 55.74 million mi²\nDistance from Sun: 151.41 million mi.";
            case "jupiter" -> "Jupiter: \nSize: 88,900 mi\nDistance from Sun: 484 million mi.";
            case "saturn" -> "Saturn: \nSize: 16.49 billion mi²\nDistance from Sun: 886 million mi.";
            case "uranus" -> "Uranus: \nSize: 3.121 billion mi²\nDistance from Sun: 1.8242 billion mi.";
            case "neptune" -> "Neptune: \nSize: 2.941 billion mi²\nDistance from Sun: 2.7793 billion mi.";
            case "pluto" -> ":(\nWe miss you Pluto...";
            default -> "You entered a invalid planet.";
        };
        JOptionPane.showMessageDialog(null,expressPlan);

    }
}
