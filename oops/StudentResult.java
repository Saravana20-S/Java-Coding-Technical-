package logicprep.oops;

class Student04 {

    int mark1;
    int mark2;
    int mark3;

    Student04(int mark1, int mark2, int mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    double calculatePercentage() {
        return (mark1 + mark2 + mark3) / 3.0;
    }

    String getResult() {
        double percentage = calculatePercentage();

        if (percentage >= 40) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
}

public class StudentResult {
    public static void main(String[] args) {

        Student04 s = new Student04(80, 90, 85);

        System.out.println("Percentage = " + (int)s.calculatePercentage());
        System.out.println("Result = " + s.getResult());
    }
}