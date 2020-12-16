package org.launchcode.java.studios.RestaurantMenu;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastUpdated;

    public void addMenuItem(MenuItem menuItem){
        this.menuItems.add(menuItem);
        this.lastUpdated = LocalDate.now();
    }

    public void removeMenuItem(MenuItem menuItem){
        this.menuItems.remove(menuItem);
        this.lastUpdated = LocalDate.now();
    }

    public LocalDate getLastUpdated(){
        return lastUpdated;
    }

    @Override
    public String toString() {
        String menu = "";
        for(MenuItem item: this.menuItems){
            if(item.isNew()){
                menu += "*";
            }

            menu += item.toString() + "\n";
        }
        menu += "\n* indicates item is new. \nLast updated: " + this.lastUpdated;
        return menu;
    }
}
