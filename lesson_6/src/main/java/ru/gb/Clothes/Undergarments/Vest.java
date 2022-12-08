package ru.gb.Clothes.Undergarments;

import java.util.ArrayList;

/**
 * Майка
 */
public class Vest extends Undergarments{

    public Vest(String name, int size, String color,
                String composition, int price) {
        super(name, size, color, composition, price);
    }
    @Override
    public String toString() {
        return String.format("Майка: %s, размер: %d;", this.getName(), this.getSize());
    }
}