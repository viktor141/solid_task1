package org.example.interfaces;

public interface Item {//Open Closed Principle и Dependency Inversion Principle
    // если вдруг интерфеса Item не ватит, можно добавить свой унаследованный интерфейс от Item и добавить необходимый функционал

    double getPrice();

    String getManufacturer();

    String getName();

    boolean isAvailable();
}
