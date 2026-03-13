package prob3;

import java.util.HashMap;

public class Library {
    private HashMap<String, Book> books = new HashMap<>();
    // add book
    public void addBook(String ISBN, String title, String author) {
        if (books.containsKey(ISBN)) {
            System.out.println("Book with ISBN " + ISBN + " already exists.");
        } else {
            Book book = new Book(ISBN, title, author);
            books.put(ISBN, book);
            System.out.println("Book " + title + " added successfully.");
        }
    }

    // borrow book
    public void borrowBook(String ISBN) {
        Book book = books.get(ISBN);
        if (book == null) {
            System.out.println("Book not found.");
        }
        else if (book.isBorrowed()) {
            System.out.println("Book already borrowed.");
        }
        else {
            book.setBorrowed(true);
            System.out.println("Book borrowed successfully.");
        }
    }

    // return book
    public void returnBook(String ISBN) {
        Book book = books.get(ISBN);
        if (book == null) {
            System.out.println("Book not found.");
        }
        else if (!book.isBorrowed()) {
            System.out.println("Book was not borrowed.");
        }
        else {
            book.setBorrowed(false);
            System.out.println("Book returned successfully.");
        }
    }

    // check borrowed
    public boolean isBookBorrowed(String ISBN) {
        Book book = books.get(ISBN);
        if (book == null) {
            return false;
        }
        return book.isBorrowed();
    }

    // get book details
    public Book getBookDetails(String ISBN) {
        return books.get(ISBN);
    }

    // list all books
    public void listAllBooks() {
        for (Book book : books.values()) {
            System.out.println(book);
        }
    }

    // list borrowed books
    public void listBorrowedBooks() {
        for (Book book : books.values()) {
            if (book.isBorrowed()) {
                System.out.println(book);
            }
        }
    }
}
