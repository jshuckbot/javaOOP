package ru.gb.Clothes.Outerwear.Trousers;

import java.util.ArrayList;

/**
 * Джинсы
 */
public class Jeans extends Trousers {


    public Jeans(String name, char gender,
                 int size, String color,
                 String composition,
                 String season, int price) {
        super(name, gender, size, color, composition, season, price);
    }

    @Override
    public String toString() {
        return String.format("Джинсы: %s, размер: %d", this.getName(), this.getSize());
    }
}