package ru.gb.Clothes.Outerwear;

import java.util.ArrayList;

/**
 * Пальто
 */
public class Coat extends Outerwear {

    public Coat(String name, int size, String color,
                String composition, char gender,
                String season, int price) {
        super(name, size, color, composition, gender, season, price);
    }
    @Override
    public String toString() {
        return String.format("Пальто: %s, размер: %d;", this.getName(), this.getSize());
    }
}