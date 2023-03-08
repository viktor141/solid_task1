package org.example;

import org.example.interfaces.Item;

import java.util.ArrayList;
import java.util.List;

public class FullProductsInventory {//Single Responsibility Principle и Singleton(решил тоже засунуть:) )

    private static FullProductsInventory instance = null;
    private List<Item> fullProductList;

    public FullProductsInventory() {
        fullProductList = new ArrayList<>();
    }

    public static FullProductsInventory getInstance() {
        if (instance == null) instance = new FullProductsInventory();
        return instance;
    }

    public List<Item> getItemsList() {
        return (instance != null) ? fullProductList : new ArrayList<>();
    }

    public void addItemToList(Item item) {
        fullProductList.add(item);
    }
}
