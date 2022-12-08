package ru.gb;

import ru.gb.Clothes.Clothes;
import ru.gb.Clothes.Outerwear.Coat;
import ru.gb.Clothes.Outerwear.Trousers.Jeans;
import ru.gb.Clothes.Sportswear.Sportswear;
import ru.gb.Clothes.Sportswear.Tracksuit;
import ru.gb.Containers.Wardrobe;
import ru.gb.Humans.Man;
import ru.gb.Humans.Woman;

import java.util.Arrays;


/**
 * Lesson 6
 *
 */
public class Program
{
    public static void main( String[] args ) {
        Wardrobe wardrobe = new Wardrobe(3);
        Man ivan = new Man("Иван", 'М', 48);
        Woman yuliana = new Woman("Юлиана", 'Ж', 44);
        Jeans peserico = new Jeans("Peserico", 'М', 48, "белые", "Хлопок", "Лето", 4000);
//        Coat zarra = new Coat("zarra", 'Ж', 50, "черный", "Шерсть", "Осень", 15000);
        Tracksuit nike = new Tracksuit("nike", 'Ж', 44, "черный", "Шерсть", 15000);
        ivan.put(peserico, wardrobe);

        Clothes thing = ivan.get(peserico, wardrobe);
        ivan.wear(thing);
    }
}
