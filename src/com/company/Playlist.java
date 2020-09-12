package com.company;

import java.util.LinkedList;

public class Playlist {
    private String name;
    private LinkedList<Song> list;

    public Playlist(String name) {
        this.name = name;
        this.list = new LinkedList<Song>();
    }
}
