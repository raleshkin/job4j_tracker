package ru.job4j.tracker.input;

import java.util.Scanner;

public class Console implements Input {
    private Scanner scanner = new Scanner(System.in);

    public String askStr(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }

    public int askInt(String question) {
        return Integer.parseInt(askStr(question));
    }
}
