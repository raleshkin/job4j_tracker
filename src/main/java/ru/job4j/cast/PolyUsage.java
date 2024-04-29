package ru.job4j.cast;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle bus = new Bus();
        Vehicle airbus = new Airbus();
        Vehicle train = new Train();

        Vehicle[] vehicles = {vehicle, bus, airbus, train};
        for (Vehicle v : vehicles) {
            v.move();
        }
    }
}
