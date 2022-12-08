package ru.gb.Clothes.Headdresses;

import java.util.ArrayList;

/**
 * Шляпа
 */
public class Hat extends Headdress {


    public Hat(String name, char gender,
               int size, String color,
               String composition, int price) {
        super(name, gender, size, color, composition, price);
    }

    @Override
    public String toString() {
        return String.format("Шляпа: %s, размер: %d", this.getName(), this.getSize());
    }
}