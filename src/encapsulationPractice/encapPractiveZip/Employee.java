package encapsulationPractice;

public class Employee {
    private String name;
    private String id;
    private double salary;
    private double bonus;
    private double raise;
    private double totalPay;


    // Constructor
    public Employee (String name, String id, double salary, double bonus, double raise)
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
        this.raise = raise;
    }

    public double calculateTotalPay(){
        totalPay = salary + bonus;
        return totalPay;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
