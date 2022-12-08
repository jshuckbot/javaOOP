package ru.gb.Clothes.Outerwear;

import java.util.ArrayList;

/**
 * Плащ
 */
public class Raincoat extends Coat {


    public Raincoat(String name, char gender,
                    int size, String color,
                    String composition,
                    String season, int price) {
        super(name, gender, size, color, composition, season, price);
    }

    @Override
    public String toString() {
        return String.format("Плащ: %s, размер: %d", this.getName(), this.getSize());
    }
}