import LibraryManagement.Member;
import LibraryManagement.Book;

public class LibraryTest {
    public static void main(String[] args) {
        Book b1 = new Book("Java Programming", "James Gosling", "12345");
        Member m1 = new Member("Rucha", 101);

        System.out.println("Book Details:");
        b1.displayBook();

        System.out.println("\nMember Details:");
        m1.displayMember();
    }
}