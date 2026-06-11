package logicprep.oops;


class Book {

    int id;
    String title;

    Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    void display() {
        System.out.println("Book Id : " + id);
        System.out.println("Book Title : " + title);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {

        Book[] books = new Book[3];

        books[0] = new Book(101, "Java");
        books[1] = new Book(102, "Python");
        books[2] = new Book(103, "Data Structures");

        System.out.println("Library Books:");
        for (Book book : books) {
            book.display();
            System.out.println();
        }

        String searchTitle = "Python";
        boolean found = false;

        for (Book book : books) {
            if (book.title.equalsIgnoreCase(searchTitle)) {
                System.out.println("Book Found:");
                book.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book Not Found");
        }
    }
}