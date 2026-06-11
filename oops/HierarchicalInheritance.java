package logicprep.oops;


class Animal02 {
    // Common parent class
}

class Dog02 extends Animal02 {

    void bark() {
        System.out.println("Dog Barking");
    }
}

class Cat extends Animal02 {

    void meow() {
        System.out.println("Cat Meowing");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {

        Dog02 d = new Dog02();
        Cat c = new Cat();

        d.bark();
        c.meow();
    }
}