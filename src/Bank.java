public class Bank {
    private java.util.ArrayList<Customer> customers = new java.util.ArrayList<Customer>();
    private int numberOfCustomers;
    private String bankName;

    public Bank(String bankname){
        bankName = bankname;
    }

    public void addCustomer(String firstname, String lastname, double balance){
        Account acc = new Account(balance);
        customers.add(new Customer(firstname,lastname));
        int index = customers.size()-1;
        Customer customer = customers.get(index);
        customer.setAccount(acc);
        System.out.printf("Your assigned ID is: %d\n", customers.size()-1);
    }

    public int getNumberOfCustomers() {
        numberOfCustomers = customers.size();
        return numberOfCustomers;
    }

    public Customer getCustomer(int index){
        return customers.get(index);
    }
}
