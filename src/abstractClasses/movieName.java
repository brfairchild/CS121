package abstractClasses;

public class movieName extends movieAbsClass {

    public void movieTitle(){

    }
    public void theaterNm() {

    }
    public void mvSeats(){

    }

    // CONSTRUCTOR
    static String mvName;
    static int theaterNm;
    static int mvSeats;

    public movieName(String mvName, int theaterNm, int mvSeats){
        this.mvName = mvName;
        this.theaterNm = theaterNm;
        this.mvSeats = mvSeats;
    }

    public static void showtMv(){
        System.out.println("Movie is loading....");
        System.out.println(mvName);
        System.out.println("loading complete....");
        System.out.println("Playing at theater number: " + theaterNm);
        System.out.println("Seats available: "+mvSeats);
    }

    @Override
    public void usrLogin() {

    }

    @Override
    public void showMv() {
    }
}
