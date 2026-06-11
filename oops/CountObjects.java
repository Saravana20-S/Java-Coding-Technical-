package logicprep.oops;

class Student03 {

    static int count = 0;

    Student03() {
        count++;
    }
}


public class CountObjects {
    public static void main(String[] args) {

        new Student03();
        new Student03();
        new Student03();

        System.out.println(Student03.count);
    }
}