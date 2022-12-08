package ru.gb.Humans;

public abstract class Human {
    private final String name;
    private final char gender;
    private final int size;

    public Human(String name, char gender, int size) {
        this.name = name;
        this.gender = gender;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getSize() {
        return size;
    }
}