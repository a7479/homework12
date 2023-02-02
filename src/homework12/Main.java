package homework12;

public class Main {


    public static void main(String[] args) {

        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Алон", "Милн");


        Book warAndPiece = new Book("Война и мир", author1, 1869);
        Book winniePooh = new Book("Винни Пух", author2, 1926);



        System.out.println("Книга: " + warAndPiece.getBookTitle()+ " автор: " + author1.getAuthorName() + " " + author1.getAuthorSurname()+ " год издания: "+ warAndPiece.getPublicationDate());
        System.out.println("Книга: " + winniePooh.getBookTitle()+ " автор: " + winniePooh.getAuthor().getAuthorName() + " " + winniePooh.getAuthor().getAuthorSurname()+ " год издания: "+ winniePooh.getPublicationDate());

        warAndPiece.setPublicationDate(2020);

        System.out.println("Книга: " + warAndPiece.getBookTitle()+ " автор: " + author1.getAuthorName() + " " + author1.getAuthorSurname()+ " год издания: "+ warAndPiece.getPublicationDate());


    }
}
