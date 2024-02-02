package ru.job4j.oop;

public class Calculator {

    public static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int y) {
        return sum(y) + multiply(y) + minus(y) + divide(y);
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println("x + y = " + result);
        Calculator calculator = new Calculator();
        result = calculator.multiply(10);
        System.out.println("x * y = " + result);
        System.out.println("y - x = " + minus(10));
        System.out.println("y / x = " + calculator.divide(10));
        System.out.println("sum_all_operations = " + calculator.sumAllOperation(10));
    }
}
