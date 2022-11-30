package ru.gb;

public interface HumanWardrobe {
    void putTheThingInWardrobe(Clothes thing, Wardrobe wardrobe);
    void viewTheEntireWardrobe(Wardrobe wardrobe);
    Clothes getThingInWardrobe(Clothes thing, Wardrobe wardrobe);
    void tryOnTheThing(Clothes thingFromWardrobe);
    void sortThingSize(Wardrobe wardrobe);
}