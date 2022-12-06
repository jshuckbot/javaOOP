package ru.gb.inputs;

import java.util.ArrayList;
import java.util.Scanner;

public class InputComplex implements Input {
    private static final Scanner scanner = new Scanner(System.in);

    @Override
    public ArrayList<Double[]> entry() {
        ArrayList<Double[]> listComplexNumbers = new ArrayList<>();
double real;
        double imaginary;
        int n = 2;

        for (int i = 0; i < n; i++) {
            System.out.printf("Введите действительную и " +
                              "мнимую часть %d комплексного числа: \n", i + 1);
            real = scanner.nextDouble();
            imaginary = scanner.nextDouble();
            Double[] pair = new Double[]{real, imaginary};
            listComplexNumbers.add(pair);
        }

        return listComplexNumbers;
    }
}