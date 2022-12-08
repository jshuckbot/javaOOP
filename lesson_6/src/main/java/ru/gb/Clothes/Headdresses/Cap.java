package ru.gb.Clothes.Headdresses;

import java.util.ArrayList;

/**
 * Кепка
 */
public class Cap extends Headdress {

    public Cap(String name, int size, String color,
               String composition,
               int price) {
        super(name, size, color, composition, price);
    }
    @Override
    public String toString() {
        return String.format("Кепка: %s, размер: %d;", this.getName(), this.getSize());
    }
}