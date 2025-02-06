package ru.job4j.ex;

public class NPEx {
    public static void main(String[] args) {
        String[] shop = new String[5];
        shop[0] = "Petr Arsentev";
        for (int i = 0; i < shop.length; i++) {
            String element = shop[i];
            if (element != null) {
                System.out.println(element + " has a size: " + element.length());
            }
        }
    }
}
