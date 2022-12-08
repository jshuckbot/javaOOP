package ru.gb;

import ru.gb.Clothes.Outerwear;

import java.util.ArrayList;
import java.util.List;

/**
 * Lesson 6
 *
 */
public class Program
{
    public static void main( String[] args )
    {
        ArrayList<String> composition = new ArrayList<>(List.of("шерсть", "полиэстер"));
        Outerwear coat = new Outerwear("Bershka", 48, "белый" , composition, 'Ж', "Зима" , 4000);
        System.out.println(coat.getComposition());
    }
}
