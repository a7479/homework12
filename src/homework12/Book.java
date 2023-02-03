package homework12;

import java.util.Objects;

public class Book {
    private String bookTitle;
    private Author author;
    private int publicationDate;

    public Book(String bookTitle, Author author, int publicationDate) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.publicationDate = publicationDate;

    }


    public String getBookTitle() {
        return this.bookTitle;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublicationDate() {
        return this.publicationDate;
    }

    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }
    @Override
    public String toString() {
        return "Название книги: " + this.bookTitle + " Автор: " + this.author + " Год издания: " + this.publicationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationDate == book.publicationDate && Objects.equals(bookTitle, book.bookTitle) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, author, publicationDate);
    }
}





