public class Main {
    public static void main(String[] args) {
        Bank MTB = new Bank("MTB");
        MTB.addBranch("VIP");
        MTB.addCustomer("VIP", new Customer("Alladin", 8.50d));
        MTB.addCustomerTransaction("VIP", "Alladin", 10.0d);
        MTB.addCustomer("VIP", new Customer("Sane", 3.50d));
        MTB.addCustomerTransaction("VIP", "Sane", 14.0d);
        MTB.addCustomer("VIP", new Customer("Ziggy", 5.30d));
        MTB.addCustomerTransaction("VIP", "Ziggy", 1.0d);
        MTB.addCustomer("VIP", new Customer("Iggy", 3.70d));
        MTB.addCustomerTransaction("VIP", "Iggy", 9.0d);

        MTB.listCustomers("VIP", true);
    }
}
