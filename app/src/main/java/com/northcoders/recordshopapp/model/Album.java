package com.northcoders.recordshopapp.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.google.gson.annotations.SerializedName;
import com.northcoders.recordshopapp.BR;

public class Album extends BaseObservable {
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

    @Bindable
    public String getId() {
        return String.valueOf(id);
    }

    public void setId(int id) {
        this.id = id;
        notifyPropertyChanged(BR.id);
    }

    @Bindable
    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
        notifyPropertyChanged(BR.albumName);
    }

    @Bindable
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
        notifyPropertyChanged(BR.artist);
    }

    @Bindable
    public String getReleaseYear() {
        return String.valueOf(releaseYear);
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
        notifyPropertyChanged(BR.releaseYear);
    }

    @Bindable
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
        notifyPropertyChanged(BR.genre);
    }
}
