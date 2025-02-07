package ru.job4j.ex;

public class Factorial {
    public int calc(int number) {
        if (number < 0) {
            throw  new IllegalArgumentException("Number could not be less 0.");
        }
        int result = 1;
        for (int i = 2; i < number + 1; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        new Factorial().calc(-1);
    }
}
