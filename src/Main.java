package folioflow.src;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("1999", "The Great Gatsby", "234234");
        Book book2 = new Book("2000", "To Kill a Mockingbird", "345345");

        Member member1 = new Member("John Doe", "123");
        Member member2 = new Member("Jane Smith", "111");

        library.addBook(book1);
        library.addBook(book2);

        library.addMember(member1);
        library.addMember(member2);

        library.displayBooks();
        library.displayMembers();
    }
}
