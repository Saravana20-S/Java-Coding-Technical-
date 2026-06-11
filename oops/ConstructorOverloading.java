package logicprep.oops;


class Student02 {

    Student02() {
        System.out.println("Default Constructor");
    }

    Student02(int id) {
        System.out.println("Constructor with ID");
    }

    Student02(int id, String name) {
        System.out.println("Constructor with ID and Name");
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {

        Student02 s1 = new Student02();
        Student02 s2 = new Student02(101);
        Student02 s3 = new Student02(101, "Karthik");
    }
}