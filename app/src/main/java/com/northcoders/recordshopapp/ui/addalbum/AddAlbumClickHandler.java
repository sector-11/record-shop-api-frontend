package com.northcoders.recordshopapp.ui.addalbum;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.northcoders.recordshopapp.model.Album;
import com.northcoders.recordshopapp.ui.mainactivity.MainActivity;
import com.northcoders.recordshopapp.ui.mainactivity.MainActivityViewModel;

public class AddAlbumClickHandler {
    Album album;
    Context context;
    MainActivityViewModel mainActivityViewModel;

    public AddAlbumClickHandler(Album album, Context context, MainActivityViewModel mainActivityViewModel) {
        this.album = album;
        this.context = context;
        this.mainActivityViewModel = mainActivityViewModel;
    }

    public void submitAlbum(View view) {
        if (album == null || album.getAlbumName() == null || album.getAlbumName().isEmpty() || album.getArtist() == null || album.getArtist().isEmpty() || album.getReleaseYear() == null || album.getReleaseYear().isEmpty() || album.getGenre() == null || album.getGenre().isEmpty()) {
            Toast.makeText(context, "All fields must be filled", Toast.LENGTH_SHORT).show();
        }

        Album albumToPost = new Album(
                0,
                album.getAlbumName(),
                album.getArtist(),
                Integer.parseInt(album.getReleaseYear()),
                album.getGenre()
        );

        mainActivityViewModel.postAlbum(albumToPost);
    }

    public void goBack(View view) {
        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);
    }
}
