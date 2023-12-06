package weekFour;

public class forLoopsListsetc {
    public static void main(String[] args) {

        // lists
        int[] number = {1,2,3,4,5};

        // for loops
        for (int n = 0; n < number.length; n++) {
            System.out.println(number[n]);
        }
        System.out.println();

        // for i in range example
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        System.out.println();

        // for and if both
        for (int i = 1; i <= 10; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}

