package ru.gb.Clothes.Outerwear;

import java.util.ArrayList;

/**
 * Куртка
 */
public class Jacket extends Outerwear{


    public Jacket(String name, char gender,
                  int size, String color,
                  String composition,
                  String season, int price) {
        super(name, gender, size, color, composition, season, price);
    }

    @Override
    public String toString() {
        return String.format("Куртка: %s, размер: %d", this.getName(), this.getSize());
    }
}