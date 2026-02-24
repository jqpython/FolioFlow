package folioflow.src;

import java.time.LocalDate;

public class Loan {

    private final Book book; // Composition
    private final Member member; // Composition
    private final LocalDate loanDate;
    private LocalDate returnDate;

    public Loan(Book book, Member member) {
        this.book = book;
        this.member = member;
        this.loanDate = LocalDate.now();
    }

    public void returnBook() {
        this.returnDate = LocalDate.now();
        System.out.println(member.getName() + " returned " + book.getTitle());
    }

    public boolean isActive() {
        return returnDate == null;
    }

    public Book getBook() {
        return book;
    }

    public Member getMember() {
        return member;
    }
}
