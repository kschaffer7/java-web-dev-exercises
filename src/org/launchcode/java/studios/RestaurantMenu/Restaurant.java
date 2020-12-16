package org.launchcode.java.studios.RestaurantMenu;

public class Restaurant {
    public static void main(String[] args) {

        MenuItem menuItem1 = new MenuItem("Mexican Pizza", 3.99, "Just Like Taco Bell!", "Main Course");
        MenuItem menuItem2 = new MenuItem("Potato", 1.99, "Loaded!", "Main Course");
        MenuItem menuItem3 = new MenuItem("Wings", 10.99, "Spicy!", "Appetizer");
        MenuItem menuItem4 = new MenuItem("Cheesecake", 2.99, "Very Very Strawberry!", "Dessert");

        Menu theMenu = new Menu();

        theMenu.addMenuItem(menuItem1);
        theMenu.addMenuItem(menuItem2);
        theMenu.addMenuItem(menuItem3);
        theMenu.addMenuItem(menuItem4);
        menuItem3.changeIsNew();

        System.out.println(theMenu);
    }
}
