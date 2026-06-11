package logicprep.oops;


class Studentt {

    int id;
    String name;

    Studentt(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

public class ParaConstructor {
    public static void main(String[] args) {

        Studentt s = new Studentt(101, "Karthik");
        s.display();
    }
}