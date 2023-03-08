package org.example;

import org.example.interfaces.Item;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<Item, Integer> buyingList;

    public Cart() {
        buyingList = new HashMap<>();
    }

    public void addToCart(Item item, int count) {
        if (item.isAvailable()) {
            buyingList.put(item, count);
            System.out.println(item.getName() + " was added");
        } else {
            System.out.println(item.getName() + " wasn't available to buy");
        }
    }

    public Map<Item, Integer> getShoppingCartList() {
        return buyingList;
    }


}
