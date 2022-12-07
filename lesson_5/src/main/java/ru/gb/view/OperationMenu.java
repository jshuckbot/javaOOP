package ru.gb.view;

import java.util.ArrayList;

public class OperationMenu extends menu {
    private static final ArrayList<String> menu;

    static
    {
        menu = new ArrayList<>();
        menu.add("1. Сложить");
        menu.add("2. Вычесть");
        menu.add("3. Перемножить");
        menu.add("4. Разделить");
    }

    public OperationMenu() {
        super(menu);

    }
}