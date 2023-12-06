package weekNine;

public class ArrayExamples {
    public static void main(String[] args) {

        // Declare an array (Most common way)
        // Can be used for all data type, in this example it is a string.
        String [] name = new String [3]; // Will be fixed size, for this example it would only hold 3 elements.


        // Showing that it can also be a final or a variable.
        final int MAXCAPACITY = 30;
        int [] classRmSize = new int[MAXCAPACITY];

        // Process the array
        String [] names = {"Libby", "Jacob", "Jessica", "John"};
        System.out.println(names[0]);

        // prints all the array
        for(int i =0; i < names.length; i++){
            System.out.println("The name in the array is #: " + (i +1) +" "+ names[i]);
        }


    }
}
