package DAO;

import entities.Product;
import util.ConnectionManager;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {

    public static final String SELECT_ALL_PRODUCTS = "SELECT * FROM products";
    public static final String SELECT_BY_PRODUCT_ID = "SELECT * FROM products WHERE id=?";

    public static Product get(int id) {
        return id > 0 ? getProductByID(id) : new Product();
    }

    private static Product getProductByID(int id) {
        try (Connection connection = ConnectionManager.open();
             PreparedStatement statement = connection.prepareStatement(SELECT_BY_PRODUCT_ID)) {
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            return result.next() ? getFromResult(result) : new Product();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static Product getFromResult(ResultSet rs) throws SQLException {
        return new Product(rs.getInt("Id"),
                rs.getString("ProductName"),
                rs.getInt("Price")
        );
    }

    public static List<Product> getAll() {
        List<Product> allProducts = new ArrayList<>();
        try (Connection connection = ConnectionManager.open();
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL_PRODUCTS)) {
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                allProducts.add(getFromResult(result));
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