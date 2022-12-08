package ru.gb.Clothes;

import java.util.ArrayList;

public class Outerwear extends Clothes{
    private char gender;
    private String season;
    public Outerwear(String name, int size, String color,
                     ArrayList<String> composition,
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