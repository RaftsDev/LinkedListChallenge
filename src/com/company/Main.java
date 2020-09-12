package com.company;

// Create a program that implements a playlist for songs
// Create a Song class having Title and Duration for a song.
// The program will have an Album class containing a list of songs.
// The albums will be stored in an ArrayList
// Songs from different albums can be added to the playlist and will appear in the list in the order
// they are added.
// Once the songs have been added to the playlist, create a menu of options to:-
// Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
// List the songs in the playlist
// A song must exist in an album before it can be added to the playlist (so you can only play songs that
// you own).
// Hint:  To replay a song, consider what happened when we went back and forth from a city before we
// started tracking the direction we were going.
// As an optional extra, provide an option to remove the current song from the playlist
// (hint: listiterator.remove()

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Create a songs
        Song song1 = new Song("Nothing else matters","5:10");
        Song song2 = new Song("Enter sandman","4:30");

        Song song3 = new Song("Ghost river","5:15");
        Song song4 = new Song("Song of myself","7:35");
        Song song5 = new Song("Ever dream","5:10");

        Song song6 = new Song("Chain","5:35");
        Song song7 = new Song("When The Levee Breaks", "7:10");

        //Albums

        Album Metallica = new Album("Metallica");
        Album Nightwish = new Album("Nightwish");
        Album Fleetwood = new Album("Fleetwood Mac");
        Album Zeppelin = new Album("Led Zeppelin");

        //Add songs to album

        Metallica.addSong(song1);
        Metallica.addSong(song2);

        Nightwish.addSong(song3);
        Nightwish.addSong(song4);
        Nightwish.addSong(song5);

        Fleetwood.addSong(song6);

        Zeppelin.addSong(song7);

        //print songs

        printSongs(Metallica);
        printSongs(Nightwish);
        printSongs(Fleetwood);
        printSongs(Zeppelin);

        //Create playlist

        Playlist playlist = new Playlist("Rock playlist");


    }

    public static void printSongs(Album album){
        ArrayList<Song> songs = album.getSongs();
        System.out.println("-");
        System.out.println("Album: "+album.getName());
        for(int i=0; i< songs.size(); i++){
            System.out.println(i+": "+songs.get(i).getTitle()+" - Duration: "+songs.get(i).getDuration());
        }
    }
}
