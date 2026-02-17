package folioflow.src;

public class Member {

    private String name;
    private String memberId;

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void displayInfo() {
        System.out.println("Member Name: " + name + ", Member ID: " + memberId);
    }
}
