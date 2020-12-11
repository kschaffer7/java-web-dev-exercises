package org.launchcode.java.studios.RestaurantMenu;

public class MenuItem {
    private Double price = 0.0;
    private String description;
    private String category;
    private boolean isNew;

    private MenuItem(Double price, String description, String category, boolean isNew){
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = true;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = isNew;
    }

}
