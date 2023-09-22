package main.java.list.pesquisa;

public class Book {
    private String title;
    private String autor;
    private int publicationYear;

    public Book(String title, String autor, int publicationYear) {
        this.title = title;
        this.autor = autor;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAutor() {
        return autor;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "title='" + title + '\'' +
                ", autor='" + autor + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }
}
