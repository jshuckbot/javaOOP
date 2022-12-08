package ru.gb.Containers;

import ru.gb.Clothes.Clothes;

import java.util.ArrayList;

/**
 * Кровать
 */
public class Bed extends Container {
    public Bed(int maxCount, ArrayList<Clothes> clothes) {
        super(maxCount);
    }

    @Override
    public String toString() {
        return "Кровать";
    }
}