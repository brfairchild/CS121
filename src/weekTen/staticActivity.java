package weekTen;

public class staticActivity {

    public static void main(String[] args) {

    }

    public int x = 4;
    public String name = "Bob";
    public double y = 23.5;
    public int count = 0;
    public String destination;


    static class instanceCount {

    }

    // DEFAULT CONST.
     void curLocation(int x, String name, double y, int count, String destination){
        this.x = x;
        this.name = name;
        this.y = y;
        this.count = count + 1;
        this.destination = destination;



    }



}
