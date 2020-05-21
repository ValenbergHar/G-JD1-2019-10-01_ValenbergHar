package org.example;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private Music music;
    private String name;
    private int volume;

    public MusicPlayer(Music music) {
    }

    public void playMusic(){
        System.out.println("gfdhfgn");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public Music getMusic() {
        return music;
    }
}
