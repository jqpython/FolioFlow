package folioflow.src;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Loan> loans = new ArrayList<>();

        BorrowPolicy policy = new StandardBorrowPolicy();

        LoanService loanService = new LoanService(loans, policy);

        Library library = new Library(loanService);

        Book book1 = BookFactory.createBook(
            BookType.PHYSICAL,
            "1984",
            "George Orwell",
            "111",
            "A1"
        );

        Member alice = new Member("Alice", 1);

        library.addBook(book1);
        library.addMember(alice);

        library.borrowBook("111", alice);
        library.borrowBook("111", alice);

        library.returnBook("111");
    }
}
