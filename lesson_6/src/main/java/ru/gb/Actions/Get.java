package ru.gb.Actions;

import ru.gb.Clothes.Clothes;
import ru.gb.Containers.Container;

/**
 * Доставать вещи
 */
public interface Get {
    Clothes get(Clothes clothes, Container container);
}