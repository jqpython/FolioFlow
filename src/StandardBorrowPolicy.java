package folioflow.src;

public class StandardBorrowPolicy implements BorrowPolicy {

    private static final int MAX_BOOKS = 3;

    @Override
    public boolean canBorrow(Member member, int currentActiveLoans) {
        return currentActiveLoans < MAX_BOOKS;
    }
}
