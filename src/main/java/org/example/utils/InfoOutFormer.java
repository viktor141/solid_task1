package org.example.utils;

import org.example.interfaces.Item;

import java.util.List;
import java.util.Map;

public class InfoOutFormer<I extends Item, V extends Integer> {

    public InfoOutFormer(List<I> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + 1 + ") " + list.get(i));
        }
    }

    public InfoOutFormer(Map<I, V> tkMap) {
        for (Map.Entry<I, V> pair : tkMap.entrySet()) {
            System.out.println(pair.getKey().getName() + " in count of " +
                    pair.getValue() + " on price " +
                    pair.getKey().getPrice() * pair.getValue().intValue());
        }
    }
}
