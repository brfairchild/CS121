package packagesDemo;

public class people {
    public String usrId;
    public boolean activeStat;

    private String name;
    private double activeTime;


    // default constructor
    public people(String usrId, boolean activeStat, String name, double activeTime){
        this.usrId = usrId;
        this.activeStat = activeStat;
        this.name = name;
        this.activeTime = activeTime;
    }


}
