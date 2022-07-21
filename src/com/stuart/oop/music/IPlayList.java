package com.stuart.oop.music;

import java.util.ArrayList;

public interface IPlayList {

    void addSong(ISong song);

    void playAllSongs();

   ArrayList<ISong> getSongs();
}
