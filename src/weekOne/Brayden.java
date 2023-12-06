package weekOne;

public class Brayden {
    public static void main(String[] args) {
        int age;
        // Double is more precise and takes up more space than a float.
        double gpa;
        // String has "" Char has ''
        char letterGrade;
        boolean csMajor;
        String name;

        age = 1;
        name = "Kevin";
        letterGrade = 'A';
        csMajor = true;
        gpa = 3.90;

        // You can also set up variables like----- String favoriteColor = "green";


        System.out.printf("This Students name is: %s \n", name);
        System.out.printf("%s's GPA is: %s \n", name, gpa);
        System.out.printf("%s's letter grade is: %s\n", name, letterGrade);
        System.out.printf("It is %s that %s is a CS Major.", csMajor, name);



    }
}
