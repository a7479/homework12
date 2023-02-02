package homework12;

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
}
