package entities;

public class Product {
    private int id;
    private String productName;
    private int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.productName = name;
        this.price = price;
    }

    public int getID() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return "{ " + getID() + "| " + getProductName() + ": " + getPrice() + " }";
    }
}
