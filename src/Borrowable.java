package folioflow.src;

public interface Borrowable {
    void borrow(Member member);

    void returnItem();

    boolean isBorrowed();
}
