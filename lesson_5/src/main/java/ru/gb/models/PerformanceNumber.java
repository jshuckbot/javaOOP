package ru.gb.models;

import ru.gb.Exception.DivisionByZeroException;

/**
 *@param <T> Рациональные или комплексные числа
 */
public interface PerformanceNumber<T> {

    //    T calcAdd();
T add(T other);
T sub(T other);
T mul(T other);
T div(T other) throws DivisionByZeroException;
}
