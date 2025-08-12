package BookMarketProject;

public class Book extends Item{
    private String author;
    private String description;
    private String category;
    private String releaseDate;

    public Book(String bookId, String name, int unitPrice){
        super(bookId, name, unitPrice);
    }

    public Book(String bookId, String name, int unitPrice, String author,
                String description, String category, String releaseDate){
        super(bookId, name, unitPrice);
        this.author = author;
        this.description = description;
        this.category = category;
        this.releaseDate = releaseDate;
    }

    @Override
    String getBookId() {
        return this.bookId;
    }

    @Override
    String getName() {
        return this.name;
    }

    @Override
    int getUnitPrice() {
        return this.unitPrice;
    }

    @Override
    void setBookId(String bookId) {
        this.bookId = bookId;
    }

    @Override
    void setName(String name) {
        this.name = name;
    }

    @Override
    void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
