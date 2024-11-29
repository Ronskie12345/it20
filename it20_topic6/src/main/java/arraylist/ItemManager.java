/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist;

/**
 *
 * @author lenovo
 */

import java.util.ArrayList;

public class ItemManager {
    private ArrayList<String> items;

    public ItemManager() {
        items = new ArrayList<>();
    }

    public void addItem(String item) {
        items.add(item);
        System.out.println(item + " has been added.");
    }

    public void removeItem(String item) {
        if (items.remove(item)) {
            System.out.println(item + " has been removed.");
        } else {
            System.out.println(item + " was not found.");
        }
    }

    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            System.out.println("Items in the list:");
            for (String item : items) {
                System.out.println("- " + item);
            }
        }
    }
}
