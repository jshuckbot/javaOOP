package ru.gb.Clothes.Outerwear;

import ru.gb.Clothes.Clothes;

import java.util.ArrayList;

/**
 * Верхняя одежда
 */
public class Outerwear extends Clothes {
    private char gender;
    private String season;
    public Outerwear(String name, int size, String color,
                     String composition,
                     char gender, String season, int price) {
        super(name, size, color, composition, price);
        this.gender = gender;
        this.season = season;
    }

    public char getGender() {
        return gender;
    }

    public String getSeason() {
        return season;
    }
}