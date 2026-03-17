package folioflow.src;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<>();
    private List<Member> members = new ArrayList<>();

    private LoanService loanService;

    public Library(LoanService loanService) {
        this.loanService = loanService;
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
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                loanService.borrowBook(book, member);
                return;
            }
        }

        System.out.println("Book not found.");
    }

    public void returnBook(String isbn) {
        loanService.returnBook(isbn);
    }
}
