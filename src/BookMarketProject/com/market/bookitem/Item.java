package BookMarketProject.com.market.bookitem;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Item {
    String bookId;
    String name;
    int unitPrice;

    abstract String getBookId();
    abstract String getName();
    abstract int getUnitPrice();

    abstract void setBookId(String bookId);
    abstract void setName(String name);
    abstract void setUnitPrice(int unitPrice);
}
