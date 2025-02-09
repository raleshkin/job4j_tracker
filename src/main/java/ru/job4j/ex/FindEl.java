package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                result = i + 1;
            } else {
                throw new ElementNotFoundException("Element not found");
            }
        }
        return result;
    }

    public static void main(String[] args) {
        try {
            System.out.println(indexOf(new String[]{"3", "r", "a", "c"}, "q"));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
