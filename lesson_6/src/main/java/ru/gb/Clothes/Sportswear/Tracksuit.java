package ru.gb.Clothes.Sportswear;

import java.util.ArrayList;

/**
 *  Спортивный костюм
 */
public class Tracksuit extends Sportswear {


    public Tracksuit(String name, char gender,
                     int size, String color,
                     String composition, int price) {
        super(name, gender, size, color, composition, price);
    }

    @Override
    public String toString() {
        return String.format("Спортивный костюм: %s, размер: %d", this.getName(), this.getSize());
    }
}