package ru.gb;

/**
 * Взаимодействие человека со шкафом
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Woman Maria = new Woman("Мария", 46);
        Wardrobe smallWardrobe = new Wardrobe(3);
        Clothes jacketEcrue = new Clothes("Куртка", "ECRUE", 46, "Осень", 4789, 'Ж');
        Clothes coatLanicka = new Clothes("Пальто", "Lanicka", 44, "Зима", 9997, 'Ж');
        Clothes coatBershka = new Clothes("Куртка", "Bershka", 48, "Зима", 9997, 'М');
        Maria.putTheThingInWardrobe(jacketEcrue, smallWardrobe);
        Maria.putTheThingInWardrobe(coatLanicka, smallWardrobe);
        Maria.putTheThingInWardrobe(coatBershka, smallWardrobe);
        Maria.sortThingSize(smallWardrobe);
//        Maria.viewTheEntireWardrobe(smallWardrobe);
        Maria.tryOnTheThing(Maria.getThingInWardrobe(coatLanicka ,smallWardrobe));
//        Maria.tryOnTheThing(Maria.getThingInWardrobe(smallWardrobe));
//        Maria.tryOnTheThing(Maria.getThingInWardrobe(smallWardrobe));
        Man Ivan = new Man("Иван", 48);
        Ivan.putTheThingInWardrobe(jacketEcrue, smallWardrobe);
        Ivan.sortThingSize(smallWardrobe);
        Ivan.viewTheEntireWardrobe(smallWardrobe);
        Ivan.tryOnTheThing(Ivan.getThingInWardrobe(coatBershka, smallWardrobe));

    }
}
