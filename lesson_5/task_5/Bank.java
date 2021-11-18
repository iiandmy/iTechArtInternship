import java.util.ArrayList;

public class Bank {
    private String name;
    ArrayList<Branch> branches;
    
    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName) {
        return this.branches.add(new Branch(branchName));
    }

    public boolean addCustomer(String branchName, Customer customer) {
        Branch requiredBranch = findBranch(branchName);
        return requiredBranch == null ? false : requiredBranch.newCustomer(customer);
    }

    public boolean addCustomerTransaction(String branchName, String customerName, Double transaction) {
        Branch requiredBranch = findBranch(branchName);
        return requiredBranch == null ? false : requiredBranch.addCustomerTransaction(customerName, transaction);
    }

    public Branch findBranch(String name) {
        for (Branch b : branches) {
            if (b.getName().equals(name))
                return b;
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        Branch requiredBranch = findBranch(branchName);
        if (requiredBranch == null)
            return false;

        for (Customer c : requiredBranch.getCustomers())
            printCustomer(c, printTransactions);
        return true;
    }

    public void printCustomer(Customer customer, boolean printTransactions) {
        System.out.println("Customer " + customer.getName());
        if (printTransactions == false)
            return;

        for (Double t : customer.getTransactions())
            System.out.println("Transaction: " + t + "$");
    }
}
