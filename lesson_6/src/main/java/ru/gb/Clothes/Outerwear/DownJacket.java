package ru.gb.Clothes.Outerwear;

import java.util.ArrayList;

/**
 * Зимняя куртка
 */
public class DownJacket extends Jacket {

    public DownJacket(String name, int size, String color,
                      String composition, char gender,
                      String season, int price) {
        super(name, size, color, composition, gender, season, price);
    }
    @Override
    public String toString() {
        return String.format("Зимняя куртка: %s, размер: %d;", this.getName(), this.getSize());
    }
}