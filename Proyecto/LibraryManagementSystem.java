public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        library.addBook(book1);
        library.addBook(book2);

        System.out.println("Books in the library:");
        library.listBooks();

        library.saveLibrary();

        library.removeBook(book1);

        System.out.println("Books in the library after removal:");
        library.listBooks();

        library.loadLibrary();

        System.out.println("Books in the library after loading:");
        library.listBooks();
    }
}