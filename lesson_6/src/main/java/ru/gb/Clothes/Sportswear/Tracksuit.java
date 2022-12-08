package ru.gb.Clothes.Sportswear;

import java.util.ArrayList;

/**
 *  Спортивный костюм
 */
public class Tracksuit extends Sportswear {

    public Tracksuit(String name, int size,
                     String color, String
                     composition, int price) {
        super(name, size, color, composition, price);
    }
    @Override
    public String toString() {
        return String.format("Спортивный костюм: %s, размер: %d;", this.getName(), this.getSize());
    }
}