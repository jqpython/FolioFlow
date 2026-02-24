package folioflow.src;

public abstract class Book implements Borrowable {

    protected String title;
    protected String author;
    protected String isbn;
    protected boolean borrowed = false;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean isBorrowed() {
        return borrowed;
    }

    @Override
    public void borrow(Member member) {
        if (!borrowed) {
            // not borrowed = true
            borrowed = true; // replace borrowed to true
            System.out.println(member.getName() + " has borrowed " + title);
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }

    @Override
    public void returnItem() {
        borrowed = false;
        System.out.println(title + " has been returned.");
    }

    public abstract void displayInfo(); // abstract method
}
