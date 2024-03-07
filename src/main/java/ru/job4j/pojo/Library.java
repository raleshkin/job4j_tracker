package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book fightClub = new Book("Бойцовский клуб", 300);
        Book storyAndersen = new Book("Сказки Андерсена", 568);
        Book threePigles = new Book("Три поросенка", 156);
        Book cleanCode = new Book("Clean code", 1);
        Book[] books = new Book[4];
        books[0] = fightClub;
        books[1] = storyAndersen;
        books[2] = threePigles;
        books[3] = cleanCode;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - " + book.getCount());
        }
        System.out.println("Book with name \"Clean code\"");
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if (book.getName() == "Clean code") {
                System.out.println(book.getName() + " - " + book.getCount());
            }
        }
    }
}
