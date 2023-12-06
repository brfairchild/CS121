package abstractClasses;

public class usrName extends movieAbsClass {
    String name;
    String passWord;


    // CONSTRUCTOR
    public usrName(String name, String passWord){
        this.name = name;
        this.passWord = passWord;
    }

    public void login(){
        System.out.println("Logging in...");
        System.out.println(name);
    }

    public void buyTk(){
        System.out.println(name + " buys a ticket.....");
    }

    @Override
    public void usrLogin() {
        System.out.println("Logging in...");
    }

    @Override
    public void showMv() {

    }
}