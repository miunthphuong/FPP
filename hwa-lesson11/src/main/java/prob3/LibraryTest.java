package prob3;

public class LibraryTest {
    public static void main(String[] args) {

        Library library = new Library();

        library.addBook("ISBN1", "Book Title 1", "Author 1");
        library.addBook("ISBN2", "Book Title 2", "Author 3");
        library.addBook("ISBN3", "Book Title 3", "Author 3");
        library.addBook("ISBN4", "Book Title 4", "Author 4");
        library.addBook("ISBN5", "Book Title 5", "Author 5");

        System.out.println("\nAll books in the library:");
        library.listAllBooks();

        System.out.println("\nBorrow book ISBN2");
        library.borrowBook("ISBN2");

        System.out.println("\nBorrowed books:");
        library.listBorrowedBooks();

        System.out.println("\nReturn book ISBN2");
        library.returnBook("ISBN2");

        System.out.println("\nReturn book ISBN1");
        library.returnBook("ISBN1");

        System.out.println("\nCheck borrowed ISBN2:");
        System.out.println(library.isBookBorrowed("ISBN2"));

        System.out.println("\nBook details:");
        System.out.println(library.getBookDetails("ISBN3"));

        System.out.println("\nBorrow book ISBN5");
        library.borrowBook("ISBN5");

        System.out.println("\nBook details:");
        System.out.println(library.getBookDetails("ISBN5"));

        System.out.println("\nAll books in the library:");
        library.listAllBooks();
    }
}
