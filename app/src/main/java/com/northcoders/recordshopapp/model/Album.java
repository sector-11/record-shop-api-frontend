package com.northcoders.recordshopapp.model;

public class Album {
    int id;
    String albumName;
    String artist;
    int releaseYear;
    String genre;

    public Album(int id, String albumName, String artist, int releaseYear, String genre) {
        this.id = id;
        this.albumName = albumName;
        this.artist = artist;
        this.releaseYear = releaseYear;
        this.genre = genre;
    }

    public Album(){
    }
}
