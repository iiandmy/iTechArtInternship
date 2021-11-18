import java.util.ArrayList;
import java.util.List;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }
    
    public String getName() { 
        return this.name; 
    }
    
    public List<Customer> getCustomers() { 
        return this.customers; 
    }
    
    public boolean newCustomer(String name, Double transaction) { 
        return this.newCustomer(new Customer(name, transaction)); 
    }

    public boolean newCustomer(Customer customer) {
        return this.getCustomers().add(customer);
    }
    
    public boolean addCustomerTransaction(String customerName, Double transaction) {
        Customer requiredCustomer = this.findCustomer(customerName);
        return requiredCustomer == null ? false : !requiredCustomer.addTransaction(transaction);
    }

    public Customer findCustomer(String name) {
        for (Customer c : customers) {
            if (c.getName().equals(name))
                return c;
        }

        return null;
    }
}
