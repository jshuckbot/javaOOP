package ru.gb.inputs;

import java.util.ArrayList;
import java.util.Scanner;

public class InputComplex implements Input {
    private static final Scanner scanner = new Scanner(System.in);
    private double real;
    private double imaginary;

    {
        real = 0;
        imaginary = 0;
    }

    @Override
    public void entry() {

        System.out.println("Введите действительную и " +
                          "мнимую часть комплексного числа: ");
        real = scanner.nextDouble();
        imaginary = scanner.nextDouble();

    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
}