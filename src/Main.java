import exception.OrderIsNotCreated;
import model.*;
import repo.CustomerRepo;
import repo.OrderRepo;
import repo.StaffRepo;
import repo.TableRepo;
import service.BillingService;
import service.MenuService;
import service.OrderService;
import service.StaffService;

import java.lang.reflect.Member;
import java.util.HashMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws OrderIsNotCreated {



        Menu menu = new Menu();
        FoodItem lassi = new FoodItem("LASSI", "BEVERAGE", FoodItemCategory.APPETIZER, 20.0);
        FoodItem pizza = new FoodItem("PIZZA", "PIZZA", FoodItemCategory.MAIN_COURSE, 300.0);
        FoodItem cake = new FoodItem("CAKE", "DESERT", FoodItemCategory.DESERT, 200.0);

        Staff staff1 = new Staff("staff1");


        StaffRepo staffRepo = new StaffRepo();
        staffRepo.addStaff(staff1);

        MenuService menuService = new MenuService(staffRepo, menu);
        menuService.addItemToMenu(staff1, lassi);
        menuService.addItemToMenu(staff1, pizza);
        menuService.addItemToMenu(staff1, cake);
        Restaurant restaurant = new Restaurant("rst", menu, 10);

        CustomerRepo customerRepo = new CustomerRepo();

        Customer customer1 = new Customer("Sumit");
        customerRepo.addCustomer(customer1);

        OrderRepo orderRepo = new OrderRepo();

        OrderService orderService = new OrderService(customerRepo, menu, orderRepo);

        orderService.browseMenu(customer1);

        HashMap<FoodItem, Integer> foodItem = new HashMap<>();
        foodItem.put(lassi, 2);
        foodItem.put(pizza, 1);

        orderService.createOrder(customer1, foodItem);

        HashMap<FoodItem, Integer> foodItem2 = new HashMap<>();
        foodItem2.put(cake, 1);
        foodItem2.put(pizza, 1);

        orderService.addItemInOrder(customer1, foodItem2);

        TableRepo tableRepo = new TableRepo();

        Table table1 = new Table();

        Table table2 = new Table();


        StaffService staffService = new StaffService(tableRepo, customerRepo, staffRepo);

        staffService.addTable(table1);
        staffService.addTable(table2);

       // staffService.markTableAsOccupied(table1, staff1, customer1);

//        staffService.markTableAsUnoccupied(staff1, table1);

        Table table3 = new Table();

        staffService.markTableAsOccupied(table3, staff1, customer1);

        Customer customer2 = new Customer("customer2");

        customerRepo.addCustomer(customer2);


        staffService.markTableAsOccupied(table3, staff1, customer2);




        BillingService billingService  = new BillingService(customerRepo, orderRepo);

        double amount = billingService.calculateTotalBill(customer1);


        billingService.payTheBill(customer1, PayMode.UPI);

    }
}