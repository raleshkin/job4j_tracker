package ru.job4j.checkstyle;

public class Broken {

    private int sizeOfEmpty = 10;
    private String surname;

    private static final String NEW_VALUE = "";

    public void echo() {
    }

    public void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    public void method() {
    }

    private String name;

    public Broken() {
    }
}