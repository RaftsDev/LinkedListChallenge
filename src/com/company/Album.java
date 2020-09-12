package com.company;

import java.util.ArrayList;

public class Album {
    private String name;
    private ArrayList<Song> songs;

    public Album(String name) {
        this.name = name;
        this.songs = new ArrayList<Song>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void addSong(Song song){
        songs.add(song);
    }

    public Song findSong(String songName){
        Song currentSong;
        for(int i = 0; i<songs.size(); i++){
            currentSong = songs.get(i);
            if(currentSong.getTitle().equals(songName)) {
                return currentSong;
            }
        }
        return null;
    }
}
