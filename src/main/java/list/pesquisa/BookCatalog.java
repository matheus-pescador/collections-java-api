package main.java.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class BookCatalog {

    private List<Book> bookList;


    public BookCatalog() {
        this.bookList = new ArrayList<>();
    }

    public void addBook(String title, String autor, int publicationYear) {
        bookList.add(new Book(title, autor, publicationYear));
    }

    public List<Book> findByAutor(String autor) {
        List<Book> booksByAutor = new ArrayList<>();
        if (!bookList.isEmpty()) {
            for (Book b : bookList) {
                if (b.getAutor().equalsIgnoreCase(autor)) {
                    booksByAutor.add(b);
                }
            }
        }
        return booksByAutor;
    }

    public List<Book> findByYearRange(int initialYear, int finalYear) {
        List<Book> booksByYearRange = new ArrayList<>();
        if (!bookList.isEmpty()) {
            for (Book b : bookList) {
                if (b.getPublicationYear() >= initialYear && b.getPublicationYear() <= finalYear) {
                    booksByYearRange.add(b);
                }
            }
        }
        return booksByYearRange;
    }

    public Book findByTitle(String title) {
        Book bookByTitle = null;
        if (!bookList.isEmpty()) {
            for (Book b : bookList) {
                if (b.getTitle().equalsIgnoreCase(title)) {
                    bookByTitle = b;
                    break;
                }
            }
        }
        return bookByTitle;
    }

    public static void main(String[] args) {
        BookCatalog bookCatalog = new BookCatalog();

        bookCatalog.addBook("Book 1", "Autor 1",2020);
        bookCatalog.addBook("Book 1", "Autor 2",2021);
        bookCatalog.addBook("Book 2", "Autor 2",2022);
        bookCatalog.addBook("Book 3", "Autor 4",2023);
        bookCatalog.addBook("Book 4", "Autor 5",1997);

        System.out.println(bookCatalog.findByAutor("Autor 2"));
        System.out.println(bookCatalog.findByYearRange(2020,2022));
        System.out.println(bookCatalog.findByTitle("Book 1"));
    }
}
