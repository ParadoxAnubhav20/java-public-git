public class Company {
    static class Employee {
        private int empId;
        private String name;
        private double salary;

        Employee(int e, String n, double d) {
            empId = e;
            name = n;
            salary = d;
        }

        public int getId() {
            return empId;
        }

        public void showDetails() {
            System.out.println("----------------------------------");
            System.out.println("Employee Details");
            System.out.println("Employee ID: " + empId);
            System.out.println("Name: " + name);
            System.out.println("Salary: " + salary);
        }
    }

    static class Manager {
        private int mngId;
        private double salary;

        Manager(int m, double s) {
            mngId = m;
            salary = s;
        }

        void increaseSalary(Employee e, double d) {
            System.out.println("Increasing salary of Employee ID: " + e.getId());
            e.salary += d;  // Accessing private member from nested class is allowed
        }

        void display() {
            System.out.println("---------------------------------");
            System.out.println("Manager Details");
            System.out.println("Manager ID: " + mngId);
            System.out.println("Salary: " + salary);
        }
    }

    public static void main(String[] args) {
        Employee e = new Employee(123, "Anubhav", 22225.50);
        e.showDetails();
        
        Manager m = new Manager(456, 56000.50);
        m.increaseSalary(e, 12350.50);
        m.display();
        
        e.showDetails();
    }
}
