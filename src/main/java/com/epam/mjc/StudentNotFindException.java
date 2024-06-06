package com.epam.mjc;

public class StudentNotFindException extends IllegalArgumentException {
    public StudentNotFindException(String message) {
        super(message);
    }
}
