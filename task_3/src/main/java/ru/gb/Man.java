package ru.gb;

public class Man extends Human {
    private static final char gender = 'М';
    public Man(String name, int size) {
        super(name, gender, size);
    }

    @Override
    public void putTheThingInWardrobe(Clothes thing, Wardrobe wardrobe) {

        if (wardrobe.getClothes().size() < wardrobe.getMaxCount()){
            wardrobe.addClothes(thing);
        } else {
            System.out.println("Мужчина, куда вам столько вещей!" +
                               "Вам нужен отдельный шкаф!");
        }
    }
}