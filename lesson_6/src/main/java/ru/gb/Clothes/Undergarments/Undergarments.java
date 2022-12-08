package ru.gb.Clothes.Undergarments;

import ru.gb.Clothes.Clothes;
import java.util.ArrayList;

/**
 * Нижнее белье
 */
public class Undergarments extends Clothes {

    public Undergarments(String name, char gender,
                         int size, String color,
                         String composition, int price) {
        super(name, gender, size, color, composition, price);
    }
}