package folioflow.src;

public class EBook extends Book {

    private double fileSizeMB;

    public EBook(String title, String author, String isbn, double fileSizeMB) {
        super(title, author, isbn);
        this.fileSizeMB = fileSizeMB;
    }

    @Override
    public void displayInfo() {
        System.out.println(
            "EBook: " +
                title +
                " by " +
                author +
                " (ISBN: " +
                isbn +
                ", Size: " +
                fileSizeMB +
                "MB)"
        );
    }
}
