package ru.gb.Clothes.Sportswear;

import ru.gb.Clothes.Clothes;
import java.util.ArrayList;

/**
 * Спортивный одежда
 */
public abstract class Sportswear extends Clothes {


    public Sportswear(String name, char gender,
                      int size, String color,
                      String composition, int price) {
        super(name, gender, size, color, composition, price);
    }
}