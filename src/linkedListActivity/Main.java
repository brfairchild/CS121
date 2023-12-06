package linkedListActivity;

public class Main {
    public static void main(String[] args) {
        UserBooking usr1 = new UserBooking("abc1234","Shrek 3",150.34,"Comedy","Who does not know Shrek?",1);
        UserBooking usr2 = new UserBooking("kevinjames23","Grown Ups 6", 198.32,"Comedy","The gang is back at it.",5);

        System.out.println(usr1.runTime);
        System.out.println(usr1.movieTitle);
        System.out.println(usr2.runTime);
        System.out.println(usr2.movieTitle);
    }
}
