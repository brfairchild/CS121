package bigOActivity;

public class BigO {

    public static void printOnce(int on){
        System.out.println(on);
    }

    public static void printNTimes(int n){
        String phrase = "This is a test. nTimes";
        while(n > 0){
            System.out.println(phrase);
            n = n - 1;
        }
    }

    public static void printNSquaredTimes(int n){
        String phrase = "This is a test. nSquared";
        double num = n * n;
        while (num > 0){
            num = num - 1;
            System.out.println("Working");
        }
    }
}
