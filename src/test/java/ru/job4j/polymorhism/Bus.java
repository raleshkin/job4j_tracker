package ru.job4j.polymorhism;

public class Bus implements Transport {
    @Override
    public void drive() {

    }

    @Override
    public void passengers(int passengers) {

    }

    @Override
    public int refillAmount(int fuel) {
        int summ = 0;
        int pricePerLiter = 51;
        summ += pricePerLiter * fuel;
        return summ;
    }
}
