package org.example.utils;

import org.example.FullProductsInventory;
import org.example.interfaces.Item;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public enum TypeFilter {//Single Responsibility Principle
    NAME("name"),
    MANUFACTURER("manufacturer"),
    PRICE("price"),
    AVAILABLE("available");

    private final String type;

    TypeFilter(String s) {
        this.type = s;
    }

    public List<Item> filtered(List<Item> list) {
        List<Item> filteredFullProductList = new ArrayList<>(list);
        switch (type) {
            case "name" -> filteredFullProductList.sort(Comparator.comparing(Item::getName));
            case "manufacturer" -> filteredFullProductList.sort(Comparator.comparing(Item::getManufacturer));
            case "price" -> filteredFullProductList.sort(Comparator.comparing(Item::getPrice));
            case "available" -> filteredFullProductList = filteredFullProductList.stream()
                    .filter(Item::isAvailable)
                    .sorted(Comparator.comparing(Item::getName))
                    .collect(Collectors.toList());
        }

        return filteredFullProductList;
    }

    public List<Item> filtered() {
        return filtered(FullProductsInventory.getInstance().getItemsList());
    }
}
