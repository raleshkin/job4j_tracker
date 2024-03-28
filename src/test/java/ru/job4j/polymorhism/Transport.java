package ru.job4j.polymorhism;

public interface Transport {
    void drive();

    void passengers(int passengers);

    int refillAmount(int fuel);
}
