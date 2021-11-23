package DAO;

import entities.Product;
import util.ConnectionManager;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {

    public static final String MYSQL_SELECT_ALL_PRODUCTS = "SELECT * FROM products";
    public static final String MYSQL_SELECT_BY_PRODUCT_ID = "SELECT * FROM products WHERE id=?";

    public static Product get(int id) {
        Product product = new Product(-1, "No match found", -1);
        try (Connection connection = ConnectionManager.open();
             PreparedStatement statement = connection.prepareStatement(MYSQL_SELECT_BY_PRODUCT_ID)) {
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                String name = rs.getString("ProductName");
                int price = rs.getInt("Price");
                int ident = rs.getInt("Id");
                product = new Product(ident, name, price);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return product;
    }

    public static List<Product> getAll() {
        List<Product> allProducts = new ArrayList<>();
        try (Connection connection = ConnectionManager.open();
            PreparedStatement statement = connection.prepareStatement(MYSQL_SELECT_ALL_PRODUCTS)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                allProducts.add(new Product(rs.getInt("Id"), rs.getString("ProductName"), rs.getInt("Price")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return allProducts;
    }

    public static void save(Product product) {
        throw new UnsupportedOperationException();
    }

    public static void update(Product product, String[] params) {
        throw new UnsupportedOperationException();
    }

    public static void delete(Product product) {
        throw new UnsupportedOperationException();
    }

    private ProductDao() {}
}