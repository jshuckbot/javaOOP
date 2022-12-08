package ru.gb.Clothes.Outerwear;

import java.util.ArrayList;

/**
 * Куртка
 */
public class Jacket extends Outerwear{

    public Jacket(String name, int size, String color,
                  String composition, char gender,
                  String season, int price) {
        super(name, size, color, composition, gender, season, price);
    }
    @Override
    public String toString() {
        return String.format("Куртка: %s, размер: %d;", this.getName(), this.getSize());
    }
}