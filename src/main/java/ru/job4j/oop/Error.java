package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public Error() {
    }

    public void printInfo() {
        System.out.println("Наличие ошибки: " + active);
        System.out.println("Код статуса ошибки: " + status);
        System.out.println("Сообщение об ошике: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error(true, 1, "Request aborted");
        error.printInfo();
        Error err = new Error();
        System.out.println();
        err.printInfo();
    }
}
