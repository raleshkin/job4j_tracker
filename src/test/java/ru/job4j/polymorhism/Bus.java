package ru.job4j.polymorhism;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Автобус тронулся!");
    }

    @Override
    public void passengers(int passengers) {
        System.out.println("Количество пассажиров внутри: " + passengers);
    }

    @Override
    public int refillAmount(int fuel) {
        int summ = 0;
        int pricePerLiter = 51;
        summ += pricePerLiter * fuel;
        return summ;
    }
}
