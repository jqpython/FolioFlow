package folioflow.src;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new PhysicalBook(
            "1999",
            "The Great Gatsby",
            "234234",
            "A1"
        );
        Book book2 = new EBook("2000", "To Kill a Mockingbird", "345345", 10);

        Member alice = new Member("Alice", 1);

        library.addBook(book1);
        library.addBook(book2);

        library.borrowBook("111", alice);
        library.borrowBook("111", alice); // test already borrowed

        book1.returnItem();
    }
}
