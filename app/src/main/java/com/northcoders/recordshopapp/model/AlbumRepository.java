package com.northcoders.recordshopapp.model;

import android.app.Application;
import android.util.Log;
import android.widget.Toast;

import androidx.lifecycle.MutableLiveData;

import com.northcoders.recordshopapp.service.AlbumApiService;
import com.northcoders.recordshopapp.service.RetrofitInstance;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AlbumRepository {
    private MutableLiveData<List<Album>> mutableLiveData = new MutableLiveData<>();
    private Application application;

    public AlbumRepository(Application application){
        this.application = application;
    }

    public MutableLiveData<List<Album>> getMutableLiveData(){
        AlbumApiService albumApiService = RetrofitInstance.getService();
        Call<List<Album>> call = albumApiService.getAllAlbums();

        call.enqueue(new Callback<List<Album>>() {
            @Override
            public void onResponse(Call<List<Album>> call, Response<List<Album>> response) {
                List<Album> responseValue = response.body();

                getMutableLiveData().setValue(responseValue);
            }

            @Override
            public void onFailure(Call<List<Album>> call, Throwable throwable) {
                Log.i("HTTP Failure", throwable.getMessage());
            }
        });

        return mutableLiveData;
    }

    public void postAlbum(Album albumToPost) {
        AlbumApiService albumApiService = RetrofitInstance.getService();
        Call<Album> call = albumApiService.postAlbum(albumToPost);

        call.enqueue(new Callback<Album>() {
            @Override
            public void onResponse(Call<Album> call, Response<Album> response) {
                Toast.makeText(application, "POST Success!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<Album> call, Throwable throwable) {
                Toast.makeText(application, "POST Success!", Toast.LENGTH_SHORT).show();
                Log.i("POST Album", throwable.getMessage());
            }
        });
    }
}
