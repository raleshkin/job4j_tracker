package ru.job4j.checkstyle;

public class Broken {

    private int sizeOfEmpty = 10;

    private String surname;

    private static final String NEW_VALUE = "";

    private String name;

    public Broken() {
    }

    public void echo() {
    }

    public void method() {
    }

    public void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }
}