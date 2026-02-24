package folioflow.src;

public class PremiumMember extends Member {

    private int borrowLimit;

    public PremiumMember(String name, int memberId, int borrowLimit) {
        super(name, memberId); //calling parent constructor
        this.borrowLimit = borrowLimit;
    }

    @Override
    public void displayInfo() {
        System.out.println(
            "Premium Member Name: " +
                name +
                ", Member ID: " +
                memberId +
                ", Borrow Limit: " +
                borrowLimit
        );
    }
}
