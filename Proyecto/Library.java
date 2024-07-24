import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> books = new ArrayList<>();

    void addBook(Book book) {
        books.add(book);
    }

    void removeBook(Book book) {
        books.remove(book);
    }

    void listBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    void saveLibrary() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("library.ser"))) {
            oos.writeObject(books);
            System.out.println("Library saved");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void loadLibrary() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("library.ser"))) {
            books = (List<Book>) ois.readObject();
            System.out.println("Library loaded");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
