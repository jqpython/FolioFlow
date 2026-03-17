package folioflow.src;

public class PremiumBorrowPolicy implements BorrowPolicy {

    private static final int MAX_BOOKS = 10;

    @Override
    public boolean canBorrow(Member member, int currentActiveLoans) {
        return currentActiveLoans < MAX_BOOKS;
    }
}
