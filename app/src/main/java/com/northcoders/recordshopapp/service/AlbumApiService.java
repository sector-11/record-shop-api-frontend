package com.northcoders.recordshopapp.service;

import com.northcoders.recordshopapp.model.Album;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface AlbumApiService {
    @GET("records")
    public Call<List<Album>> getAllAlbums();

    @POST("records")
    public Call<Album> postAlbum(@Body Album album);
}
