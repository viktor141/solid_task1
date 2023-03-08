package org.example;

import org.example.interfaces.Item;
import org.example.items.*;
import org.example.utils.InfoOutFormer;
import org.example.utils.TypeFilter;

import java.util.List;

public class Main {//Магические числа присутствуют лишь в класах, которые олицетворяют товары(items);

    public static void main(String[] args) {
        productsInit();
        Person client = new Person();

        List<Item> items = client.lookAtAllItems();
        new InfoOutFormer<>(items);
        System.out.println();

        client.wantToBuy(items.get(1), 1);
        client.wantToBuy(items.get(3), 2);
        client.wantToBuy(items.get(4), 4);
        client.wantToBuy(items.get(0), 2);
        System.out.println();

        new InfoOutFormer<>(client.lookWithFilters(TypeFilter.AVAILABLE));
        System.out.println();

        new InfoOutFormer<>(client.searchOnKeyWord("bread"));
        System.out.println();

        new InfoOutFormer<>(client.whatsInMyCart());
        System.out.println();


    }


    private static void productsInit() {
        new Bread();
        new Cakes();
        new Cookies();
        new Grain();
        new Milk();
    }
}