package ru.gb;

import java.util.ArrayList;

public class Wardrobe {
  private final int maxCount;
  private final ArrayList<Clothes> clothes = new ArrayList<>();

    public Wardrobe(int maxCount) {
        this.maxCount = maxCount;
    }


    public ArrayList<Clothes> getClothes() {
        return clothes;
    }

    public void addClothes(Clothes thing) {
        clothes.add(thing);
    }

    public Clothes takeThing(Clothes thing) {
        int idx = clothes.indexOf(thing);
        return clothes.remove(idx);
    }

    public Clothes takeThing() {
        return clothes.remove(clothes.size()-1);
    }

    public int getMaxCount() {
        return maxCount;
    }
}