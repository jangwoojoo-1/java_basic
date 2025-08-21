package BookMarketProject.com.market.bookitem;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
    public String getBookId() {
        return this.bookId;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getUnitPrice() {
        return this.unitPrice;
    }

    @Override
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }
}
