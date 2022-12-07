package ru.gb.view;

import java.util.ArrayList;

public abstract class menu {
  protected ArrayList<String> menu;

  public menu(ArrayList<String> menu) {
      this.menu = menu;
  }
    public void show() {
        System.out.println("\nВыберете пункт меню:");
        for (String line : this.menu) {
            System.out.println(line);
        }
    }

}