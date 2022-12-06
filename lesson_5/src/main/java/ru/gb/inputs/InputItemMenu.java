package ru.gb.inputs;

import java.util.Scanner;

public class InputItemMenu {
    private static final Scanner scanner = new Scanner(System.in);
    private int item;

    public void entry(){
        this.item = scanner.nextInt();
    }

    public int get() {
        return this.item;
    }
}