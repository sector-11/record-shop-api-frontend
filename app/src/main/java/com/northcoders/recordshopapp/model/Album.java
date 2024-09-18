package com.northcoders.recordshopapp.model;

import com.google.gson.annotations.SerializedName;

public class Album {
    @SerializedName("id")
    private int id;
    @SerializedName("albumName")
    private String albumName;
    @SerializedName("artist")
    private String artist;
    @SerializedName("releaseYear")
    private int releaseYear;
    @SerializedName("genre")
    private String genre;

    public Album(int id, String albumName, String artist, int releaseYear, String genre) {
        this.id = id;
        this.albumName = albumName;
        this.artist = artist;
        this.releaseYear = releaseYear;
        this.genre = genre;
    }

    public Album(){
    }

    public String getId() {
        return String.valueOf(id);
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getReleaseYear() {
        return String.valueOf(releaseYear);
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
