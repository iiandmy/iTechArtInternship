import DAO.ProductDao;

public class Main {
    public static void main(String[] args) {
        System.out.println(ProductDao.getAll());
        ProductDao.delete(10);
        System.out.println(ProductDao.getAll());
    }
}
