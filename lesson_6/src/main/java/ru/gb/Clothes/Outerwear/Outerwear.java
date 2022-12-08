package ru.gb.Clothes.Outerwear;

import ru.gb.Clothes.Clothes;

import java.util.ArrayList;

/**
 * Верхняя одежда
 */
public abstract class Outerwear extends Clothes {
    private String season;

    public Outerwear(String name, char gender,
                     int size, String color,
                     String composition,
                     String season, int price) {
        super(name, gender, size, color, composition, price);
        this.season = season;
    }


    public String getSeason() {
        return season;
    }
}