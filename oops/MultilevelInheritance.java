package logicprep.oops;


class Animal01 {

    void eat() {
        System.out.println("Eating");
    }
}

class Dog01 extends Animal01 {

    void bark() {
        System.out.println("Barking");
    }
}

class Puppy extends Dog01 {

    void play() {
        System.out.println("Playing");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {

        Puppy p = new Puppy();

        p.eat();
        p.bark();
        p.play();
    }
}