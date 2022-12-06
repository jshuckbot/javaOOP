package ru.gb.models;

import ru.gb.Exception.DivisionByZeroException;

/**
 * Класс для работы с комплексными числами
 */
public class Complex implements PerformanceNumber<Complex> {
    private final double real;
    private final double imaginary;

    private final String TEXT_DIVISION_BY_ZERRO;

    {
        TEXT_DIVISION_BY_ZERRO = "Нельзя делить на ноль!";
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    @Override
    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }

    @Override
    public Complex sub(Complex other) {
        return new Complex(this.real - other.real, this.imaginary - other.imaginary);
    }

    @Override
    public Complex mul(Complex other) {
        return new Complex(this.real * other.real - this.imaginary * other.imaginary,
                           this.imaginary * other.real + this.real * other.imaginary);
    }

    @Override
    public Complex div(Complex other) throws DivisionByZeroException {
        if (other.real == 0 && other.imaginary == 0) {
            throw new DivisionByZeroException(TEXT_DIVISION_BY_ZERRO);
        }
        double newReal = (this.real * other.real + this.imaginary * other.imaginary) /
                         (other.real * other.real + other.imaginary * other.imaginary);

        double newImaginary = (this.imaginary * other.real - this.real * other.imaginary) /
                              (other.real * other.real + other.imaginary * other.imaginary);
        return new Complex(newReal, newImaginary);
    }

    @Override
    public String toString() {
        if (this.imaginary > 0) {
            return String.format("\nРезультат работы: %.2f + %.2fi", this.real, this.imaginary);
        } else if (this.imaginary < 0) {
            return String.format("\nРезультат работы: %.2f%.2fi", this.real, this.imaginary);

        } else {
            return String.format("\nРезультат работы %.2f", this.real);
        }
    }
}