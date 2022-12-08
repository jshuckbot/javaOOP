package ru.gb.Actions;

import ru.gb.Clothes.Clothes;
import ru.gb.Containers.Container;

/**
 * Положить вещи
 */
public interface Put {
    void put(Clothes clothes, Container container);
}