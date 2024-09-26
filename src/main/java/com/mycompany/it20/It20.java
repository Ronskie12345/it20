/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.it20;

/**
 *
 * @author lenovo
 */

import java.util.ArrayList;

public class It20 {
    
    public static void main(String[] args) {
        // Create an ArrayList to store String elements
        ArrayList<String> items = new ArrayList<>();

        // Adding elements to the ArrayList
        items.add("Apple");
        items.add("Banana");
        items.add("Orange");

        // Displaying the ArrayList
        System.out.println("Items in the ArrayList: " + items);

        // Removing an item from the ArrayList
        items.remove("Banana");

        // Displaying the ArrayList after removal
        System.out.println("Items after removing Banana: " + items);

        // Accessing an item from the ArrayList
        String item = items.get(0);
        System.out.println("First item in the ArrayList: " + item);

        // Iterating over the ArrayList
        System.out.println("Iterating through the ArrayList:");
        for (String fruit : items) {
            System.out.println(fruit);
        }
    }
}
