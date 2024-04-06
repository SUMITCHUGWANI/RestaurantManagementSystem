package model;

import java.util.ArrayList;
import java.util.HashSet;

public class Menu {

    private HashSet<FoodItem> foodItemList;

    public Menu() {

        this.foodItemList = new HashSet<>();
    }

    public HashSet<FoodItem> getFoodItemList() {
        return foodItemList;
    }

    public void setFoodItemList(HashSet<FoodItem> foodItemList) {
        this.foodItemList = foodItemList;
    }

    public void addFoodItem(FoodItem item){
        this.foodItemList.add(item);
    }

    public void removeFoodItem(FoodItem item){
        this.foodItemList.remove(item);
    }

    public void updateFoodItem(FoodItem oldItem, FoodItem newItem){
        this.foodItemList.remove(oldItem);
        this.foodItemList.add(newItem);
    }
}
