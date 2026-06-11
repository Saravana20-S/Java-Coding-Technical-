package logicprep.oops;

class Animal04 {

    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog04 extends Animal04 {

    @Override
    void sound() {
        System.out.println("Dog Bark");
    }
}

public class RunTimePoly {
    public static void main(String[] args) {

        Animal04 a = new Dog04(); 
        a.sound();
    }
}