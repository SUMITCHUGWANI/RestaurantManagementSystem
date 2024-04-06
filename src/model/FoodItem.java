package model;

public class FoodItem {
    private String name;

    private String description;

    private FoodItemCategory category;
    private Double price;

    public FoodItem(String name, String description, FoodItemCategory category, Double price) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public FoodItemCategory getCategory() {
        return category;
    }

    public void setCategory(FoodItemCategory category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", category=" + category +
                ", price=" + price +
                '}';
    }
}
