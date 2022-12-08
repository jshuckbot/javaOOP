package ru.gb.Clothes;

public abstract class Clothes {
    private final String name;
    private final char gender;
    private final int size;
    private final String color;
    private final String composition;
    private final int price;

    public Clothes(String name, char gender, int size, String color,
                   String composition, int price) {
        this.name = name;
        this.size = size;
        this.color = color;
        this.composition = composition;
        this.price = price;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }
}