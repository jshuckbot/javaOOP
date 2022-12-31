package ru.gb.Exceptions;

public class NotCorrentName extends RuntimeException {
    public NotCorrentName(String msg) {
        super(msg);
    }
}