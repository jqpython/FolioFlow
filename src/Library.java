package folioflow.src;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<>();
    private List<Member> members = new ArrayList<>();
    private List<Loan> loans = new ArrayList<>();

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

    public void borrowBook(String isbn, Member member) {
        Book bookToBorrow = null;
        for (Book book : books) {
            if (book.isbn.equals(isbn)) {
                bookToBorrow = book;
                break;
            }
        }

        if (bookToBorrow == null) {
            System.out.println("Book not found.");
            return;
        }

        // Check if already borrowed
        for (Loan loan : loans) {
            if (loan.getBook().equals(bookToBorrow) && loan.isActive()) {
                System.out.println("Book already borrowed.");
                return;
            }
        }

        Loan loan = new Loan(bookToBorrow, member);
        loans.add(loan);

        System.out.println(
            member.getName() + " borrowed " + bookToBorrow.getTitle()
        );
    }

    public void returnBook(String isbn) {
        for (Loan loan : loans) {
            if (loan.getBook().getIsbn().equals(isbn) && loan.isActive()) {
                loan.returnBook();
                return;
            }
        }
        System.out.println("Active loan not found.");
    }
}
