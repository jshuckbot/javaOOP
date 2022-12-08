package ru.gb.Clothes.Outerwear;

import java.util.ArrayList;

/**
 * Плащ
 */
public class Raincoat extends Coat {

    public Raincoat(String name, int size, String color,
                    String composition, char gender,
                    String season, int price) {
        super(name, size, color, composition, gender, season, price);
    }
    @Override
    public String toString() {
        return String.format("Плащ: %s, размер: %d;", this.getName(), this.getSize());
    }
}