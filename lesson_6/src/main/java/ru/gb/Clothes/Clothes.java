package ru.gb.Clothes;

import java.util.ArrayList;

public abstract class Clothes {
    private final String name;
    private final int size;
    private final String color;
    private String composition;
    private final int price;

    public Clothes(String name, int size, String color,
                   String composition, int price) {
        this.name = name;
        this.size = size;
        this.color = color;
        this.composition = composition;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public String getComposition() {
        return composition;
    }

    public int getPrice() {
        return price;
    }
}