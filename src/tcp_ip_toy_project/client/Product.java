package tcp_ip_toy_project.client;

public class Product {//DB
    private String productNo;
    private String name;
    private int price;
    private int count;

    Product(){ }

    public String getProductNo() {
        return productNo;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
