package workshop4;

class Person {
    protected String address;

    Person(String address) {
        this.address = address;
    }
}

class Employee extends Person {
    String department;

    Employee(String address, String department) {
        super(address);
        this.department = department;
    }

    void displayEmployee() {
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
    }
}

public class ProtectedDemo {
    public static void main(String[] args) {
        Employee e = new Employee("Biratnagar", "IT");
        e.displayEmployee();
    }
}