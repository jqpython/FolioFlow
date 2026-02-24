package folioflow.src;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;
    private List<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void addMember(Member member) {
        members.add(member);
        System.out.println("Member added: " + member.getName());
    }

    public void displayBooks() {
        System.out.println("\nLibrary Books:");
        for (Book book : books) {
            book.displayInfo();
        }
    }

    public void displayMembers() {
        System.out.println("\nLibrary Members:");
        for (Member member : members) {
            member.displayInfo();
        }
    }

    public void borrowBook(String isbn, Member member) {
        for (Book book : books) {
            if (book.isbn.equals(isbn)) {
                book.borrow(member); // Polymorphism through interface
                return;
            }
        }
        System.out.println("Book not found.");
    }
}
