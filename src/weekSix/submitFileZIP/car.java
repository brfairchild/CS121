package weekSix;

import java.time.Year;

public class car {
    //Member Variables / Instant Variables / Fields
    String Make,Model,VIN,Color;
    private int year;
    int miles;
    boolean isElectric;


    //default constructor
    /// >Initializes the variables that we have above.

    //Constructors
    car(){//can also be considered default constructor
        this.year = 2000;
        this.Make = "Empty";
        this.Model = "Empty";
        this.VIN = "SDFUH89H9S8DF";
        this.miles = 0;
        this.Color = "red";
    }

    // Giving the constructor certain ways to make it.
    car(String Make, String Model, int year, int miles){
        this.Make = Make;
        this.Model = Model;
        this.year = year;
        this.miles = miles;
    }

    // SETTERS and GETTERS
    //Setters (Mutator method)
    public void setYear(int YEARS){
        this.year = YEARS;
    }
    //Getter (ACCESSOR METHOD)
    public int getYear(){
        return year;
    }

}
