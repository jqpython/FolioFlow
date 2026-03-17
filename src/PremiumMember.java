package folioflow.src;

public class PremiumMember extends Member {

    private String membershipLevel;

    public PremiumMember(String name, int memberId, String membershipLevel) {
        super(name, memberId);
        this.membershipLevel = membershipLevel;
    }

    public String getMembershipLevel() {
        return membershipLevel;
    }

    @Override
    public String toString() {
        return (
            super.getName() +
            " (ID: " +
            super.getMemberId() +
            ") Level: " +
            membershipLevel
        );
    }
}
