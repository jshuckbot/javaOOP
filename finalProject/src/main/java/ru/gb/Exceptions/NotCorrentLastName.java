package ru.gb.Exceptions;

public class NotCorrentLastName extends RuntimeException {
    public NotCorrentLastName(String msg) {
            super(msg);
        }
}