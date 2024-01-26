package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        switch (position) {
            case 1:
                System.out.println("Пусть бегут неуклюже, пешеходы по лужам, а вода по асфальту рекой...");
                break;
            case 2:
                System.out.println("Спят усталые игрушки, книжки спят. Одеяла и подушки ждут ребят...");
                break;
            default:
                System.out.println("Песня не найдена");
                break;
        }
    }

    public static void main(String[] args) {
        Jukebox song = new Jukebox();
        int track = 3;
        song.music(track);
    }
}
