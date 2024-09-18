package com.northcoders.recordshopapp.model;

import com.google.gson.annotations.SerializedName;

public class Album {
    @SerializedName("id")
    int id;
    @SerializedName("albumName")
    String albumName;
    @SerializedName("artist")
    String artist;
    @SerializedName("releaseYear")
    int releaseYear;
    @SerializedName("genre")
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
