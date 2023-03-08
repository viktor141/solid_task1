package org.example.utils;

import org.example.FullProductsInventory;
import org.example.interfaces.Item;

import java.util.List;
import java.util.stream.Collectors;

public class FindWithKeyWord {//Single Responsibility Principle

    private String keyWord;

    public FindWithKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public List<Item> find() {
        return FullProductsInventory.getInstance().getItemsList().stream()
                .filter(item -> item.getName().toLowerCase().contains(keyWord.toLowerCase()) ||
                        item.getManufacturer().toLowerCase().contains(keyWord.toLowerCase())).collect(Collectors.toList());
    }

}
