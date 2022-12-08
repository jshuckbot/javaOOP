package ru.gb.Clothes.Undergarments;

import java.util.ArrayList;

/**
 * Пижама
 */
public class Pajamas extends Undergarments {

    public Pajamas(String name, int size, String color,
                   String composition, int price) {
        super(name, size, color, composition, price);
    }

    @Override
    public String toString() {
        return String.format("Пижама: %s, размер: %d;", this.getName(), this.getSize());
    }
}