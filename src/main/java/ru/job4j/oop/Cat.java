package ru.job4j.oop;

public class Cat {

    private String food;

    private String name;

    public void show() {
        System.out.println("Cat's name " + this.name + ". Cat's eat " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        Cat peppy = new Cat();
        Cat sparky = new Cat();
        Cat whiteCat = new Cat();
        whiteCat.eat("kotleta");
        whiteCat.giveNick("Pushok");
        whiteCat.show();
        Cat blackCat = new Cat();
        blackCat.eat("fish");
        blackCat.giveNick("Chernish");
        blackCat.show();
    }
}
