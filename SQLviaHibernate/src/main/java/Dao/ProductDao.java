package Dao;

import entities.Product;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactory;

import java.util.List;

public class ProductDao {
    public static Product findById(int id) {
        return HibernateSessionFactory.getSessionFactory().openSession().get(Product.class, id);
    }

    public static void save(Product product) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(product);
        transaction.commit();
        session.close();
    }

    public static void update(Product product) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(product);
        transaction.commit();
        session.close();
    }

    public static void delete(Product product) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(product);
        transaction.commit();
        session.close();
    }

    public static List<Product> findAll() {
        return (List<Product>) HibernateSessionFactory.getSessionFactory().openSession().createQuery("From Product").list();
    }

    private ProductDao() {}
}