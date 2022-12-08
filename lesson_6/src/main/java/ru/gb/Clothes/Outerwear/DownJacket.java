package ru.gb.Clothes.Outerwear;

import java.util.ArrayList;

/**
 * Зимняя куртка
 */
public class DownJacket extends Jacket {


    public DownJacket(String name, char gender,
                      int size, String color,
                      String composition,
                      String season, int price) {
        super(name, gender, size, color, composition, season, price);
    }

    @Override
    public String toString() {
        return String.format("Зимняя куртка: %s, размер: %d", this.getName(), this.getSize());
    }
}