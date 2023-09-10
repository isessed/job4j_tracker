package ru.job4j.oop;

public class Jukebox {

    public void music(int position) {
        String lyrics;
        if (position == 1) {
            lyrics = "Пусть бегут неуклюже";
            System.out.println(lyrics);
        } else if (position == 2) {
            lyrics = "Спокойной ночи";
            System.out.println(lyrics);
        } else {
            lyrics = "Песня не найдена";
            System.out.println(lyrics);
        }
    }

    public static void main(String[] args) {
        Jukebox songs = new Jukebox();
        songs.music(1);
        songs.music(2);
        songs.music(3);
    }
}
