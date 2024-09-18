package com.northcoders.recordshopapp.ui.mainactivity;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.northcoders.recordshopapp.model.Album;
import com.northcoders.recordshopapp.model.AlbumRepository;

import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {
    AlbumRepository albumRepository;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        this.albumRepository = new AlbumRepository(application);
    }

    MutableLiveData<List<Album>> getAlbumRepositoryData(){
        return albumRepository.getMutableLiveData();
    }
}
