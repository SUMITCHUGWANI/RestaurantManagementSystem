package service;

import exception.StaffDoesNotExists;
import model.FoodItem;
import model.Menu;
import model.Staff;
import repo.StaffRepo;

public class MenuService {

    private StaffRepo staffRepo;

    private Menu menu;

    public MenuService(StaffRepo staffRepo, Menu menu) {
        this.staffRepo = staffRepo;
        this.menu = menu;
    }

    public void addItemToMenu(Staff staff, FoodItem foodItem){
        if (!staffRepo.checkIfStaffExists(staff)){
            throw new StaffDoesNotExists();
        }
        menu.addFoodItem(foodItem);
        System.out.println("Item is added successfully");
    }

    public void updateItemToMenu(Staff staff, FoodItem oldItem, FoodItem newItem){
        if (!staffRepo.checkIfStaffExists(staff)){
            throw new StaffDoesNotExists();
        }
        menu.updateFoodItem(oldItem, newItem);

    }

    public void removeItemToMenu(Staff staff, FoodItem foodItem){
        if (!staffRepo.checkIfStaffExists(staff)){
            throw new StaffDoesNotExists();
        }
        menu.removeFoodItem(foodItem);
    }


}
