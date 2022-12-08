package ru.gb.Clothes.Outerwear;

import java.util.ArrayList;

/**
 * Пальто
 */
public class Coat extends Outerwear {


    public Coat(String name, char gender,
                int size, String color,
                String composition,
                String season, int price) {
        super(name, gender, size, color, composition, season, price);
    }

    @Override
    public String toString() {
        return String.format("Пальто: %s, размер: %d", this.getName(), this.getSize());
    }
}