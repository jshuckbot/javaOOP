package ru.gb.inputs;

import java.util.ArrayList;
import java.util.Scanner;

public class InputRational implements Input {
    private double number;
    private static final Scanner scanner = new Scanner(System.in);

    @Override
    public void entry() {
            System.out.println("Введите число: ");
            number = scanner.nextDouble();
        }

    public double getNumber() {
        return number;
    }
}