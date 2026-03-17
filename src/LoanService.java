package folioflow.src;

import java.util.List;

public class LoanService {

    private List<Loan> loans;
    private BorrowPolicy borrowPolicy;

    public LoanService(List<Loan> loans, BorrowPolicy borrowPolicy) {
        this.loans = loans;
        this.borrowPolicy = borrowPolicy;
    }

    public void borrowBook(Book book, Member member) {
        int activeLoans = 0;

        for (Loan loan : loans) {
            if (loan.getMember().equals(member) && loan.isActive()) {
                activeLoans++;
            }
        }

        if (!borrowPolicy.canBorrow(member, activeLoans)) {
            System.out.println("Borrow limit reached for " + member.getName());
            return;
        }

        for (Loan loan : loans) {
            if (loan.getBook().equals(book) && loan.isActive()) {
                System.out.println("Book already borrowed.");
                return;
            }
        }

        Loan loan = new Loan(book, member);
        loans.add(loan);

        System.out.println(member.getName() + " borrowed " + book.getTitle());
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
