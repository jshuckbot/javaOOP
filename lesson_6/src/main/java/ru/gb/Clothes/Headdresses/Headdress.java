package ru.gb.Clothes.Headdresses;

import ru.gb.Clothes.Clothes;
import java.util.ArrayList;

/**
 * Головной убор
 */
public abstract class Headdress extends Clothes {

    public Headdress(String name, char gender,
                     int size, String color,
                     String composition, int price) {
        super(name, gender, size, color, composition, price);
    }
}