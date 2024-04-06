package repo;

import model.Customer;
import model.Order;

import java.util.HashMap;

public class OrderRepo {
    HashMap<Customer, Order> orderHashMap = new HashMap<>();


    public void createOrder(Customer customer, Order order) {
        orderHashMap.put(customer, order);
    }



    public Order getOrder(Customer customer){
        return orderHashMap.get(customer);
    }
}
