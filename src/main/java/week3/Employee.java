package week3;

public class Employee {

    String empId;
    String empName;
    double salary;
    boolean isIntern;

    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    // Q3: Permanent employee
    public Employee(String empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.isIntern = false;

        employeeCount++;
    }

    // Q3: Intern
    public Employee(String empId, String empName) {
        this(empId, empName, 0);
        this.isIntern = true;
    }

    // Q3
    void printProfile() {
        System.out.println(empId + " | " + empName + " | Rs "
                + salary + " | Intern: " + isIntern);
    }

    // Q5
    static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee("E-101", "Divya", 65000);
        Employee e2 = new Employee("E-102", "Arjun");
        Employee e3 = new Employee("E-103", "Rahul", 55000);

        Employee.printCompanyInfo();
    }
}