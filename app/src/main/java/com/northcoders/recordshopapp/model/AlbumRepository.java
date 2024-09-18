package com.northcoders.recordshopapp.model;

import android.app.Application;

import androidx.lifecycle.MutableLiveData;

import java.util.List;

public class AlbumRepository {
    private MutableLiveData<List<Album>> mutableLiveData = new MutableLiveData<>();
    private Application application;

    public AlbumRepository(Application application){
        this.application = application;
    }
}
