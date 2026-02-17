package folioflow.src;

public class Book {

    private String id;
    private String title;
    private String isbn;

    public Book(String id, String title, String isbn) {
        this.id = id;
        this.title = title;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void displayInfo() {
        System.out.println(
            "Book ID: " + id + ", Title: " + title + ", ISBN: " + isbn
        );
    }
}
