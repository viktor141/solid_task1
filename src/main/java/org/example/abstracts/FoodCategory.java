package org.example.abstracts;

import org.example.FullProductsInventory;
import org.example.interfaces.Item;

public abstract class FoodCategory implements Item {//DRY, Liskov substitution principle, Dependency Inversion Principle)
    // я создал абстракцию которая реализует категорию товаров еды, а дальше наследованием я решил вопрос добавления разных вариантов этой еды
    // так же в случа надобности, можно наследоваться от этого класса, дабы поменять или доавить новый функционал, в своём абстрактном классе

    private static FullProductsInventory fullProductsInventory = FullProductsInventory.getInstance();
    private String name;
    private String manufacturer;
    private double price;

    private boolean available;

    public FoodCategory(String name, String manufacturer, double price, boolean available) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.available = available;
        fullProductsInventory.addItemToList(this);
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public String toString() {
        return "[Name: " + name + ", Manufacturer: " + manufacturer + ", Price: " + price + ", Available: " + (available ? "yes" : "no") + "]";
    }
}
