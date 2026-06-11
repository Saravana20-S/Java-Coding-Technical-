package logicprep.oops;


class AreaCalculator {

    double area(double radius) {
        return 3.14 * radius * radius;
    }

    int area(int length, int breadth) {
        return length * breadth;
    }
}

public class CalculateArea {
    public static void main(String[] args) {

        AreaCalculator obj = new AreaCalculator();

        System.out.println("Circle Area = " + obj.area(5));
        System.out.println("Rectangle Area = " + obj.area(10, 5));
    }
}
