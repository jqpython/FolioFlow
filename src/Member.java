package folioflow.src;

public class Member {

    protected String name;
    protected int memberId;

    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }

    public void displayInfo() {
        System.out.println("Member Name: " + name + ", Member ID: " + memberId);
    }
}
