package interfaces;

import abstractClasses.movieName;
import abstractClasses.usrName;

public interface movieInterfaceCls {
    public static void main(String[] args) {
        // setting up user
        usrName Kevin = new usrName("Kevin","ABC123");

        // running function in username
        Kevin.login();

        // setting up movie
        movieName Shrek = new movieName("Shrek",12,24);

        // running function in movieName
        movieName.showtMv();

        // kevin buys a ticket
        Kevin.buyTk();
    }
}
