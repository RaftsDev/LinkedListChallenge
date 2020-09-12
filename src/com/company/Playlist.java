package com.company;

import java.util.LinkedList;

public class Playlist {
    private String name;
    private LinkedList<Song> list;

    public Playlist(String name) {
        this.name = name;
        this.list = new LinkedList<Song>();
    }

    public void addSong(Album album, String songName){
        Song song = album.findSong(songName);
        if(song != null){
            list.add(song);
        }else{
            System.out.println("Song: "+songName+" in album: "+album.getName()+" not available.");
        }

    }
}
