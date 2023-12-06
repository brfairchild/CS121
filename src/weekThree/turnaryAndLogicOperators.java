package weekThree;

import javax.swing.*;

public class turnaryAndLogicOperators {
    public static void main(String[] args) {
        // && --> and
        // || --> or

        //boolean isSunny;
        //boolean isWarm;
        //isSunny = true;
        //isWarm = false;


        //Both have to be true
        /// if (isSunny && isWarm){
        ///     System.out.println("Lets get ice cream");
        /// }

        //Atleast one is true
        /// if (isSunny || isWarm){
        ///     System.out.println("Lets get ice cream--");
        /// }

        // condition ? expression1 : expression2
        /// int num = 12;
        /// String results = (num % 2 == 0) ? "Even" : "Odd";
        /// System.out.println(results);

        //Switch Stataments vs Switch Expressions
        /// String planet = JOptionPane.showInputDialog(null, "Enter a planet: ");
        /// String planetInfo = "";

        /// switch(planet){
        ///     case "earth":
        ///         planetInfo = "where we live now.";
        ///         break;
        ///     case "mars":
        ///         planetInfo = "This is know as the red planet.";
        ///         break;
        ///     case "venus":
        ///         planetInfo = "you entered in venus.";
        ///         break;
        ///     default:
        ///         planetInfo = "The planet you entered has no info in this program.";
        ///         break;
        /// }
        /// JOptionPane.showMessageDialog(null,planetInfo);

        // SWITCH EXPRESSION
        String planetExpress = JOptionPane.showInputDialog("Enter A planet: ");
        String planetInfoExpress = switch(planetExpress){
            case "earth" -> "This is where you live.";
            case "mars" -> "This is that red one that is close.";
            case "venus" -> "I think this one is blue, idk tho";
            default -> "You entered a invalid planet.";
        };

    }
}
