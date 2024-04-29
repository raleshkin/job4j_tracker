package ru.job4j.cast;

public class Train extends Vehicle {
    String className = getClass().getSimpleName();

    @Override
    public void move() {
        System.out.println(className + " двигается по железной дороге");
    }

    public void trainControl() {
        System.out.println(className + " управляется машинист");
    }
}
