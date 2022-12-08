package ru.gb.Clothes.Outerwear.Trousers;

import ru.gb.Clothes.Outerwear.Outerwear;
import java.util.ArrayList;

/**
 * Брюки
 */
public class Trousers extends Outerwear {

    public Trousers(String name, int size, String color, String composition, char gender, String season, int price) {
        super(name, size, color, composition, gender, season, price);
    }
    @Override
    public String toString() {
        return String.format("Джинсы: %s, размер: %d;", this.getName(), this.getSize());
    }
}