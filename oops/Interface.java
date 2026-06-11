package logicprep.oops;


interface Animal05 {

    void sound();
}

class Dog05 implements Animal05 {

    @Override
    public void sound() {
        System.out.println("Dog Barking");
    }
}

public class Interface {
    public static void main(String[] args) {

        Dog05 d = new Dog05();
        d.sound();
    }
}