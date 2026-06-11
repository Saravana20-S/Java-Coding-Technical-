package logicprep.oops;


class Student {

    int id;
    String name;
    int marks;

    void display() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class Student01 {
    public static void main(String[] args) {

        Student s = new Student();

        s.id = 101;
        s.name = "Karthik";
        s.marks = 85;

        s.display();
    }
}
