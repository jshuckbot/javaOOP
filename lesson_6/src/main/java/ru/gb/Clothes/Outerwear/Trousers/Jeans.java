package ru.gb.Clothes.Outerwear.Trousers;

import java.util.ArrayList;

/**
 * Джинсы
 */
public class Jeans extends Trousers {

    public Jeans(String name, int size, String color,
                 String composition, char gender,
                 String season, int price) {
        super(name, size, color, composition, gender, season, price);
    }
    @Override
    public String toString() {
        return String.format("Джинсы: %s, размер: %d;", this.getName(), this.getSize());
    }
}