package folioflow.src;

public interface BorrowPolicy {
    boolean canBorrow(Member member, int currentActiveLoans);
}
