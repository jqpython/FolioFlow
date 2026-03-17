package folioflow.src;

public class BookFactory {

    public static Book createBook(
        BookType type,
        String title,
        String author,
        String isbn,
        Object extraInfo
    ) {
        switch (type) {
            case PHYSICAL:
                return new PhysicalBook(
                    title,
                    author,
                    isbn,
                    (String) extraInfo
                );
            case EBOOK:
                return new EBook(title, author, isbn, (Double) extraInfo);
            default:
                throw new IllegalArgumentException("Invalid book type");
        }
    }
}
