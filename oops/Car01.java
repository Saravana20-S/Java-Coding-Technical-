package logicprep.oops;


class Car {

    String brand;
    String model;
    int price;

    void display() {
        System.out.println(brand + " " + model + " " + price);
    }
}

public class Car01 {
    public static void main(String[] args) {

        Car car = new Car();

        car.brand = "Toyota";
        car.model = "Camry";
        car.price = 2500000;

        car.display();
    }
}