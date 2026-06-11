package logicprep.oops;


class Animal03 {

    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog03 extends Animal03 {

    @Override
    void sound() {
        System.out.println("Dog Bark");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {

        Animal03 a = new Animal03();
        a.sound();

        Dog03 d = new Dog03();
        d.sound();
    }
}
