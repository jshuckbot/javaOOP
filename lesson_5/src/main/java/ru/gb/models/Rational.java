package ru.gb.models;

import ru.gb.Exception.DivisionByZeroException;

/**
 * Класс для работы с рациональными числами
 */
public class Rational implements PerformanceNumber<Rational> {
    protected Double number;

    private final String TEXT_DIVISION_BY_ZERRO;

    {
        TEXT_DIVISION_BY_ZERRO = "Нельзя делить на ноль!";
    }

    public Rational(double a) {
            this.number = a;
    }

    @Override
    public Rational add(Rational other) {
        return new Rational(this.number + other.number);
    }

    @Override
    public Rational sub(Rational other) {
        return new Rational(this.number - other.number);
    }

    @Override
    public Rational mul(Rational other) {
        return new Rational(this.number * other.number);
    }

    @Override
    public Rational div(Rational other) throws DivisionByZeroException {
        if (other.number == 0) {
            throw new DivisionByZeroException(TEXT_DIVISION_BY_ZERRO);
        }
        return new Rational(this.number / other.number);
    }

    @Override
    public String toString() {
        return String.format("%.2f", this.number);
    }

    public Double getNumber() {
        return number;
    }
}