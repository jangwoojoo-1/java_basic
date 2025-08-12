package java_advanced_01.day13.exceptionEx.test02;

public abstract class Payment implements Payable{
    protected String shopName;
    protected String productName;
    protected long productPrice;

    public Payment(String shopName, String productName, long productPrice){
        this.shopName = shopName;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public abstract void pay() throws PayException;
}
