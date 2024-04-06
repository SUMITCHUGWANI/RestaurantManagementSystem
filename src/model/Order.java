package model;

import java.util.HashMap;

public class Order {
    public static int id;
    public Customer customer;

    HashMap<FoodItem, Integer> orderItemMap;


    public Order(Customer customer, HashMap<FoodItem, Integer> orderItemMap) {
        this.customer = customer;
        this.orderItemMap = orderItemMap;
    }

    public Order(Customer customer) {
        this.customer = customer;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Order.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setOrderItemMap(HashMap<FoodItem, Integer> orderItemMap) {
        this.orderItemMap = orderItemMap;
    }

    public HashMap<FoodItem, Integer> getOrderItemMap() {
        return orderItemMap;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customer=" + customer +
                ", orderItemMap=" + orderItemMap +
                '}';
    }
}
