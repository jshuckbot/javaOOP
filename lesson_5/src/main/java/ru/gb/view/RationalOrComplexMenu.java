package ru.gb.view;

import java.util.ArrayList;

public class RationalOrComplexMenu extends menu {
    private static final ArrayList<String> menu;

    static
    {
        menu = new ArrayList<>();
        menu.add("1. Рациональные рациональные");
        menu.add("2. Комплексные числа");
        menu.add("0. Выйти\n");
    }

    public RationalOrComplexMenu() {
        super(menu);

    }
}