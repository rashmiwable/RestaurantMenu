package com.java.restourant;

import java.util.ArrayList;

public class Menu {

    private ArrayList<Menu> item;
    private String lastUpdated;

    public ArrayList<Menu> getItem() {
        return item;
    }

    public void setItem(ArrayList<Menu> item) {
        this.item = item;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

   public Menu(Menu item, String lstUpdated) {
        this.item.add(item);
        this.lastUpdated = lstUpdated;
    }

}
