package ru.job4j.cast;

public class Bus extends Vehicle {
    String className = getClass().getSimpleName();

    @Override
    public void move() {
        System.out.println(className + " двигается по дороге");
    }

    public void busControl() {
        System.out.println(getClass() + " управляет водитель");
    }
}
