package DAO;

import entities.Product;
import util.ConnectionManager;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {

    public static final String SELECT_ALL_PRODUCTS = "SELECT * FROM products";
    public static final String SELECT_BY_PRODUCT_ID = "SELECT * FROM products WHERE id=?";
    public static final String INSERT_PRODUCT = "INSERT INTO products(`ProductName`, `Price`) VALUES (?, ?)";
    public static final String UPDATE_PRODUCT = "UPDATE products SET `ProductName`=?,`Price`=? WHERE Id=?";
    public static final String DELETE_PRODUCT = "DELETE FROM products WHERE Id=?";

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
            return result.next() ? getListFromResult(result) : new ArrayList<>(){{add(new Product());}};
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static List<Product> getListFromResult(ResultSet result) throws SQLException {
        List<Product> resultList = new ArrayList<>();
        do {
            resultList.add(getFromResult(result));
        } while (result.next());
        return resultList;
    }

    public static void save(Product product) {
        try (Connection connection = ConnectionManager.open();
            PreparedStatement statement = connection.prepareStatement(INSERT_PRODUCT)) {
            statement.setString(1, product.getProductName());
            statement.setInt(2, product.getPrice());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void update(int id, String[] params) {
        try (Connection connection = ConnectionManager.open();
            PreparedStatement statement = connection.prepareStatement(UPDATE_PRODUCT)) {
            statement.setString(1, params[0]);
            statement.setInt(2, Integer.parseInt(params[1]));
            statement.setInt(3, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void delete(int id) {
        try (Connection connection = ConnectionManager.open();
            PreparedStatement statement = connection.prepareStatement(DELETE_PRODUCT)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private ProductDao() {}
}