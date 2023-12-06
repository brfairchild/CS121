package encapsulationPractice;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John Doe", "12345", 75600.80, 20000, 0.05);
        Employee employee2 = new Employee("Jane Doe","ASD213", 90000,15000, 0.50);

        System.out.println(employee1.getName());
        employee1.setName("John Doe, Jr.");
        System.out.println(employee1.getName());
    }

}
