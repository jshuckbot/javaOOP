package ru.gb;

public class Clothes implements Comparable<Clothes>{
    private final String category;
    private final String name;
    private final int size;
    private final String season;
    private final int price;
    private final char gender;

    public Clothes(String category, String name, int size, String season, int price,
                   char gender) {
        this.category = category;
        this.name = name;
        this.size = size;
        this.season = season;
        this.price = price;
        this.gender = gender;
    }

    public String getCategory() {
        return category;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getSeason() {
        return season;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return String.format("Категория: %s, " +
                             "Название одежды: %s, " +
                             "Размер: %d Сезон: %s, " +
                             "Пол: %s", category, name, size,
                             season, gender);
    }

    @Override
    public int compareTo(Clothes thing) {
        return Integer.compare(this.size, thing.size);
    }
   
}