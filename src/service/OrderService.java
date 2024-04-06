package service;

import exception.CustomerDoesNotExists;
import exception.OrderIsNotCreated;
import model.Customer;
import model.FoodItem;
import model.Menu;
import model.Order;
import repo.CustomerRepo;
import repo.OrderRepo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class OrderService {

    private CustomerRepo customerRepo;

    private OrderRepo orderRepo;

    private Menu menu;

    public OrderService(CustomerRepo customerRepo, Menu menu, OrderRepo orderRepo) {
        this.customerRepo = customerRepo;
        this.menu = menu;
        this.orderRepo  = orderRepo;
    }

    public void browseMenu(Customer customer){
        if (!customerRepo.checkIfCustomerExists(customer)){
            throw new CustomerDoesNotExists();
        }

        HashSet<FoodItem> foodItemHashSet = menu.getFoodItemList();

        for (FoodItem foodItem : foodItemHashSet){
            System.out.println(foodItem);
        }
    }

    public void createOrder(Customer customer, HashMap<FoodItem, Integer> foodItem){
        Order order = new Order(customer, foodItem);
        orderRepo.createOrder(customer, order);
        System.out.println("order created successfully");
        System.out.println(order);
    }

    public void addItemInOrder(Customer customer, HashMap<FoodItem, Integer> foodItem) throws OrderIsNotCreated {
        Order order = orderRepo.getOrder(customer);
        if ( null == order) {
            throw new OrderIsNotCreated();
        }

        HashMap<FoodItem, Integer> foodItemIntegerHashMap = order.getOrderItemMap();

        for (Map.Entry<FoodItem, Integer> entry : foodItem.entrySet()){
            if (foodItemIntegerHashMap.containsKey(entry.getKey())){
                foodItemIntegerHashMap.put(entry.getKey(), foodItemIntegerHashMap.get(entry.getKey()) + entry.getValue());
            }else{
                foodItemIntegerHashMap.put(entry.getKey(), entry.getValue());
            }
        }

        System.out.println("order :" +  order);

//        600 + 40 + 200

    }


}
