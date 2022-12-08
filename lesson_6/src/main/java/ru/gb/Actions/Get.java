package ru.gb.Actions;

import ru.gb.Clothes.Clothes;
import ru.gb.Containers.Container;
import ru.gb.Exception.EmptyContainer;

/**
 * Доставать вещи
 */
public interface Get {
    Clothes get(Clothes clothes, Container container);
//    Clothes get(Container container);
}