package logicprep.oops;

class Employee {

    int employeeId;
    String employeeName;
    double salary;

    void display() {
        System.out.println("Employee Id : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Salary : " + salary);
    }
}

public class Employee01 {
    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.employeeId = 1001;
        emp.employeeName = "John";
        emp.salary = 50000;

        emp.display();
    }
}