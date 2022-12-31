package ru.gb.Exceptions;

public class NotCorrentGender extends RuntimeException {
    public NotCorrentGender(String msg) {
        super(msg);
    }
}