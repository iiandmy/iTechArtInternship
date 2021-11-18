import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, Double transaction) {
        this.name = name;
        this.transactions = new ArrayList<>();
        this.transactions.add(transaction);
    }

    public String getName() { return this.name; }
    public List<Double> getTransactions() { return this.transactions; }
    public boolean addTransaction(Double transaction) { return this.transactions.add(transaction); }
}