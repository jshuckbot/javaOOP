package ru.gb;

public class Woman extends Human {
    private static final char gender = 'Ж';
    public Woman(String name, int size) {
        super(name, gender, size);
    }

    @Override
    public void putTheThingInWardrobe(Clothes thing, Wardrobe wardrobe) {
        if (wardrobe.getClothes().size() < wardrobe.getMaxCount()){
            wardrobe.addClothes(thing);
        } else {
            System.out.println("Женщина, куда вам столько вещей!" +
                               "оставьте полочку для своего мужчины!");
        }
    }

}