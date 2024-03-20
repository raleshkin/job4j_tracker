package ru.job4j.enumeration;

public class CarService {
    public static void main(String[] args) {
        Status toyota = Status.FINISHED;
        Status volvo = Status.WAITING;
        System.out.println("Toyota status: " + toyota);
        System.out.println("Volvo status: " + volvo);
    }
}
