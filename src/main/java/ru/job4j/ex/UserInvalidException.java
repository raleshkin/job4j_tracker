package ru.job4j.ex;

public class UserIbvalidException extends UserNotFoundException {
    public UserIbvalidException(String message) {
        super(message);
    }
}
