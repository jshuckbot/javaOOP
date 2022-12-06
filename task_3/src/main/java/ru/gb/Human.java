package ru.gb;


import java.util.Collections;

public abstract class Human implements HumanWardrobe {
  private final String name;
  protected final int size;
  private final char gender;

    public Human(String name, char gender,  int size) {
        this.name = name;
        this.gender = gender;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public char getGender() {
        return this.gender;
    }

    public void viewTheEntireWardrobe(Wardrobe wardrobe) {
        for (Clothes thing : wardrobe.getClothes()) {
            System.out.println(thing);
        }
    }

    public Clothes getThingInWardrobe(Clothes thing, Wardrobe wardrobe) {
        if (!wardrobe.getClothes().isEmpty()) {
            return wardrobe.takeThing(thing);
        }

        return null;
    }

    public Clothes getThingInWardrobe(Wardrobe wardrobe) {
        if (!wardrobe.getClothes().isEmpty()) {
            return wardrobe.takeThing();
        }

        return null;
    }

    public void tryOnTheThing(Clothes thingFromWardrobe) {
        if (thingFromWardrobe == null){
            System.out.println("Шкаф пустой, чтобы достать вещи, в него нужно положить");
            return;
        }
        if (thingFromWardrobe.getSize() == size &&
            thingFromWardrobe.getGender() == gender) {
            System.out.printf("%s %s подошла, можно идти на работу\n",
                              thingFromWardrobe.getCategory(),
                              thingFromWardrobe.getName());
        } else {
            System.out.printf("Вещь %s %s не подошла по размеру или вы взяли не свою\n",
                              thingFromWardrobe.getCategory(),
                              thingFromWardrobe.getName());
        }
    }

    @Override
    public void sortThingSize(Wardrobe wardrobe) {
        Collections.sort(wardrobe.getClothes());
    }
}