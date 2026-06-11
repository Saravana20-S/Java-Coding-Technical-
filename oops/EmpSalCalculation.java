package logicprep.oops;


class Employee02 {

    int monthlySalary;

    Employee02(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    int calculateAnnualSalary() {
        return monthlySalary * 12;
    }
}


public class EmpSalCalculation {
    public static void main(String[] args) {

        Employee02 emp = new Employee02(50000);

        System.out.println("Annual Salary = " + emp.calculateAnnualSalary());
    }
}