package folioflow.src;

public class PhysicalBook extends Book {

    private String shelfLocation;

    public PhysicalBook(
        String title,
        String author,
        String isbn,
        String shelfLocation
    ) {
        super(title, author, isbn);
        this.shelfLocation = shelfLocation;
    }

    @Override
    public void displayInfo() {
        System.out.println(
            "Physical Book: " + title + " | Shelf: " + shelfLocation
        );
    }
}
