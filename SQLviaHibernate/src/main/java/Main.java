import Dao.ProductDao;
import entities.Product;

public class Main {
    public static void main(String[] args) {
        System.out.println(ProductDao.findAll());
        ProductDao.save(new Product("Apple Magic Board", 300));
        System.out.println(ProductDao.findAll());
    }
}
