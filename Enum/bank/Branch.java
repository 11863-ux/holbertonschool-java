import java.util.ArrayList;

public class Branch {
    String name;
    ArrayList<Customer> customers;

    Branch(String name){
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double transaction){
        Customer hasCustomer=findCustomer(customerName);
        if(hasCustomer!=null){
            customers.add(new Customer(customerName, transaction));
            return true;
        }else return false;
    }

    public boolean addCustomerTransaction(String customerName, double transaction){
        for(Customer customer : customers){
            if(customer.name.equals(customerName)){
                customer.getTransactions().add(transaction);
                return true;
            }
        }
        return false;
    }

    public Customer findCustomer(String customerName){
        for(Customer customer:customers){
            if(customer.name.equals(customerName)){
                return customer;
            }
        }
        return null;
    }





}
