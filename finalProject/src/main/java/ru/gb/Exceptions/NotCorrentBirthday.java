package ru.gb.Exceptions;

public class NotCorrentBirthday extends RuntimeException {
    public NotCorrentBirthday(String msg) {
        super(msg);
    }
}