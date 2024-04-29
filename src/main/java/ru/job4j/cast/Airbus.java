package ru.job4j.cast;

public class Airbus extends Vehicle {
    String className = getClass().getSimpleName();

    @Override
    public void move() {
        System.out.println(className + " двигается по воздуху");
    }

    public void airbusControl() {
        System.out.println(className + " управляет пилот");
    }
}
