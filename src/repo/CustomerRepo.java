package repo;

import model.Customer;
import model.Staff;

import java.util.HashSet;

public class CustomerRepo {

    HashSet<Customer> customerHashSet = new HashSet<>();

    public void addCustomer(Customer customer){
        customerHashSet.add(customer);
    }

    public boolean checkIfCustomerExists(Customer customer){
        return customerHashSet.contains(customer);
    }
}
