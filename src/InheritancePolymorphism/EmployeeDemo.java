package InheritancePolymorphism;

public class EmployeeDemo {

        public static void main(String[] args) {
            // Creating a FullTimeEmployee object
            FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Varun", 101, 50000);

            // Creating a PartTimeEmployee object
            PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Babu", 102, 12, 40);

            // Printing details of both employees
            System.out.println(fullTimeEmployee.getDetails());
            System.out.println(partTimeEmployee.getDetails());
        }
}

// Base class Employee
class Employee {
    String name;
    int id;

    // Constructor for Employee
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to get the details of an Employee
    public String getDetails() {
        return "Employee Name: " + name + ", ID: " + id;
    }
}

// Subclass FullTimeEmployee that extends Employee
class FullTimeEmployee extends Employee {
    double salary;

    // Constructor for FullTimeEmployee
    public FullTimeEmployee(String name, int id, double salary) {
        super(name, id); // Calling the constructor of the superclass (Employee)
        this.salary = salary;
    }

    // Overriding the getDetails method to provide full-time employee details
    @Override
    public String getDetails() {
        return super.getDetails() + ", Full-Time Salary: $" + salary;
    }
}

// Subclass PartTimeEmployee that extends Employee
class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    // Constructor for PartTimeEmployee
    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id); // Calling the constructor of the superclass (Employee)
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Overriding the getDetails method to provide part-time employee details
    @Override
    public String getDetails() {
        return super.getDetails() + ", Hourly Rate: $" + hourlyRate + ", Hours Worked: " + hoursWorked;
    }
}
