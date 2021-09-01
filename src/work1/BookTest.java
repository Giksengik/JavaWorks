package work1;

public class BookTest {

    public static void main(String[] args) {
        Book book =  new Book("Atlant raspravil plechi", "Ant ");
        System.out.println(book);
        book.setAuthor("Tolstoi");
        book.setName("Voina i mir");
        book.readBook();
    }
}
