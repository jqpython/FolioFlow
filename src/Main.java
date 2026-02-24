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

        Member alice = new Member("Alice", 1);
        library.addBook(book1);
        library.addMember(alice);

        library.borrowBook("111", alice);
        library.borrowBook("111", alice); // test already borrowed

        library.returnBook("111");
    }
}
