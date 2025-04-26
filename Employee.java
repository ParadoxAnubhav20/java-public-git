import java.math.BigDecimal;

public class Employee {
    // Instance variables
    private String name;
    private int age;
    private String location;
    private BigDecimal salary;
    public static int totalEmployees=0;

    // Constructor
    public Employee(String name, int age, String location, double salary) {
        totalEmployees++;
        this.name = name;
        this.age = age;
        this.location = location;
        this.salary = BigDecimal.valueOf(salary);
    }

    // Getter and setter methods for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter methods for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter and setter methods for location
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // Getter and setter methods for salary
    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    // Method to raise salary
    public void raiseSalary(double amount) {
        System.out.println("Salary of " + this.name + " is increased by " + amount);
        this.salary = this.salary.add(BigDecimal.valueOf(amount));
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Name of Employee: " + this.name);
        System.out.println("Age of Employee: " + this.age);
        System.out.println("Location of the Employee: " + this.location);
        System.out.println("Salary of the Employee: " + this.salary);
    }

    // Main method
    public static void main(String[] args) {
        // Creating employee objects
        Employee e1 = new Employee("Anubhav", 23, "Kolkata", 22000.25);
        Employee e2 = new Employee("Debroop", 22, "Sonarpur", 24500);

        // Displaying initial details
        e1.displayDetails();
        e2.displayDetails();

        // Raising salary
        e1.raiseSalary(1500);
        e2.raiseSalary(1200);

        // Displaying updated details
        e1.displayDetails();
        e2.displayDetails();

        System.out.println("Total No of Employees:"+Employee.totalEmployees);

    }
}
