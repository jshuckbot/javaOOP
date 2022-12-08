package ru.gb.Actions;

import ru.gb.Clothes.Clothes;
import ru.gb.Containers.Container;

/**
 * Примерить вещи
 */
public interface Wear {
    void wear(Clothes clothes, Container container);
}