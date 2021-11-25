package entities;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "ProductName")
    private String productName;

    @Column(name = "Price")
    private int price;

    public Product(String name, int price) {
        this.productName = name;
        this.price = price;
    }

    public Product() {
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
        return "entities.Product{" +
                "id: " + getID() +
                ", name: " + getProductName() +
                ", price: " + getPrice() +
                " }";
    }
}
