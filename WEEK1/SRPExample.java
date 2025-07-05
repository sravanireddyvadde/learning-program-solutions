package WEEK1;

class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getDetails() {
        return "Employee: " + name + ", ID: " + id;
    }
}

class EmployeePrinter {
    public void printDetails(Employee emp) {
        System.out.println(emp.getDetails());
    }
}

public class SRPExample {
    public static void main(String[] args) {
        Employee emp = new Employee("Anu", 101);
        EmployeePrinter printer = new EmployeePrinter();
        printer.printDetails(emp);
    }
}
