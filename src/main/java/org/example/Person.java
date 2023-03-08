package org.example;

import org.example.interfaces.Item;
import org.example.utils.FindWithKeyWord;
import org.example.utils.TypeFilter;

import java.util.List;
import java.util.Map;

public class Person {//Single Responsibility Principle

    private Cart cart;

    public Person() {
        cart = new Cart();
    }

    public void wantToBuy(Item item, int count) {
        cart.addToCart(item, count);
    }

    public List<Item> lookAtAllItems() {
        return FullProductsInventory.getInstance().getItemsList();
    }

    public List<Item> lookWithFilters(TypeFilter typeFilter) {
        return typeFilter.filtered();
    }

    public List<Item> searchOnKeyWord(String keyWord) {
        return new FindWithKeyWord(keyWord).find();
    }

    public Map<Item, Integer> whatsInMyCart() {
        return cart.getShoppingCartList();
    }

}
