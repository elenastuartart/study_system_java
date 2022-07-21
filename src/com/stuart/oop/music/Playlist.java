package com.stuart.oop.music;

import java.util.ArrayList;

public class Playlist implements IPlayList{

    private ArrayList<ISong> songs;

    public Playlist() {
        this.songs = new ArrayList<ISong>();
    }


    public void setSongs(ArrayList<ISong> songs) {
        this.songs = songs;
    }

    @Override
    public void addSong(ISong song) {
        this.songs.add(song);
    }

    @Override
    public void playAllSongs() {
        for (int i = 0; i < this.songs.size(); i++) {
            var song = this.songs.get(i);
            song.play();
        }
    }

    @Override
    public ArrayList<ISong> getSongs() {
        return this.songs;
    }
}
