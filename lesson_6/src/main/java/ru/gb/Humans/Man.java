package ru.gb.Humans;


import ru.gb.Actions.Get;
import ru.gb.Actions.Put;
import ru.gb.Actions.Wear;
import ru.gb.Clothes.Clothes;
import ru.gb.Containers.Container;
import ru.gb.Exception.EmptyContainer;
import ru.gb.Exception.FullContainer;


public class Man extends Human implements Get, Put, Wear {
    public Man(String name, char gender, int size) {
        super(name, gender, size);
    }

    @Override
    public Clothes get(Clothes clothes, Container container) {
        try{
            return container.takeClothes(clothes);
        } catch (EmptyContainer e) {
            System.out.println(e);
        }

        return null;
    }

    @Override
    //должно быть в контейнере
    public void put(Clothes clothes, Container container) {
        try {
            container.setClothesList(clothes);
        } catch (FullContainer fe) {
            System.out.println(fe);
        }
        }

    @Override
    public void wear(Clothes clothes, Container container) {

    }
}