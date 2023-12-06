package linkedListActivity;

import java.util.ArrayList;
import java.util.LinkedList;

public class UserBooking {

    // instance variables
    String UserName,movieTitle,genre,description;
    Double runTime;
    int theaters;

    // the LinkedLised
    LinkedList<String> theaterList = new LinkedList<>();


    // Constructor

    public UserBooking(String userName, String movieTitle,Double runTime, String genre,String description, int theaters){
        this.UserName = userName;
        this.movieTitle = movieTitle;
        this.runTime = runTime;
        this.genre = genre;
        this.description = description;
        this.theaters=theaters;
    }

    public void addTheater(String x){
        theaterList.add(x);
    }

    public void removeTheater(String x) {
        theaterList.remove(x);
    }

    public void getUserInfo(int x){
        System.out.println(theaterList.get(x));
    }

    public void displayUserBooking(){
        System.out.println(theaterList);
    }









}
