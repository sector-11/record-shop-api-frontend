package com.northcoders.recordshopapp.ui.mainactivity;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.northcoders.recordshopapp.ui.addalbum.AddNewAlbumActivity;

public class MainActivityClickHandler {
    Context context;

    public MainActivityClickHandler(Context context) {
        this.context = context;
    }

    public void goToAddAlbum(View view) {
        Intent intent = new Intent(context, AddNewAlbumActivity.class);
        context.startActivity(intent);
    }
}
