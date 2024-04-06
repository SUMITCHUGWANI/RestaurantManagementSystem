package service;

import model.*;
import repo.CustomerRepo;
import repo.OrderRepo;

import java.util.HashMap;
import java.util.Map;

public class BillingService {

    private CustomerRepo customerRepo;

    private OrderRepo orderRepo;

    public BillingService(CustomerRepo customerRepo, OrderRepo orderRepo) {
        this.customerRepo = customerRepo;
        this.orderRepo = orderRepo;
    }

    public double calculateTotalBill(Customer customer){
        Order order = orderRepo.getOrder(customer);
        double totalAmountBeforeTax = 0.0;
        HashMap<FoodItem, Integer> orderMap = order.getOrderItemMap();

        for (Map.Entry<FoodItem, Integer> entry : orderMap.entrySet()){
            totalAmountBeforeTax += (entry.getKey().getPrice()) * entry.getValue();
        }

        double tax = totalAmountBeforeTax * 0.05;

        double totalAmount = totalAmountBeforeTax + tax;

        System.out.println("Total bill for customer "+ customer.getName() + " in rupees is : "+ totalAmount);
        return totalAmount;
    }

    public void payTheBill(Customer customer, PayMode payMode){
        double amount = calculateTotalBill(customer);
        Order order = orderRepo.getOrder(customer);
        Bill bill  = new Bill(payMode, amount, customer, order);
        System.out.println("Bill paid by customer "+ bill);
        System.out.println(bill);

        // PG

    }
}
