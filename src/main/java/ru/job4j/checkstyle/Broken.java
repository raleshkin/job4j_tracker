package ru.job4j.checkstyle;

public class Broken {

    private int sizeOfEmpty = 10;
    public String surname;

    public static final String NEW_VALUE = "";

    void echo() {
    }

    void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    void method() {
    }

    public static void main(String[] args) {
        String name;
        new Broken();
    }
}