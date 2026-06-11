package logicprep.oops;


class Employee03 {

    int id;
    String name;

    Employee03(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("Employee ID : " + id);
        System.out.println("Employee Name : " + name);
    }
}

public class EmpManagement {
    public static void main(String[] args) {

        Employee03[] employees = new Employee03[3];

        employees[0] = new Employee03(101, "Karthik");
        employees[1] = new Employee03(102, "John");
        employees[2] = new Employee03(103, "David");

        System.out.println("Employee Details:");
        for (Employee03 emp : employees) {
            emp.display();
            System.out.println();
        }

        int searchId = 102;
        boolean found = false;

        for (Employee03 emp : employees) {
            if (emp.id == searchId) {
                System.out.println("Employee Found:");
                emp.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee Not Found");
        }
    }
}
