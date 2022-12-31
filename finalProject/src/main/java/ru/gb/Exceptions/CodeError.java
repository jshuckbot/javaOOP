package ru.gb.Exceptions;

public class CodeError {
    public static boolean checkingCode(int code) {
        if (code == -1 ) {
            System.out.println("Вы ввели длину данных меньше чем требовалось. ");
            return true;
        }
        if (code == -2 ) {
            System.out.println("Вы ввели длину данных больше чем требовалось. ");
            return true;
        }
        return false;
    }
}