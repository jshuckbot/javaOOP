package ru.gb;


import ru.gb.Clothes.Outerwear.Trousers.Jeans;
import ru.gb.Containers.Wardrobe;
import ru.gb.Exception.EmptyContainer;
import ru.gb.Exception.FullContainer;
import ru.gb.Humans.Man;
import java.lang.module.FindException;


/**
 * Lesson 6
 *
 */
public class Program
{
    public static void main( String[] args ) {
        Wardrobe wardrobe = new Wardrobe(3);
        Man ivan = new Man("Иван", 'М', 48);
        Jeans peserico = new Jeans("Peserico", 48, "белые", "Хлопок", 'М', "Лето", 4000);
            ivan.put(peserico, wardrobe);
            ivan.put(peserico, wardrobe);
            System.out.println(ivan.get(peserico, wardrobe));
            System.out.println(ivan.get(peserico, wardrobe));

    }
}
