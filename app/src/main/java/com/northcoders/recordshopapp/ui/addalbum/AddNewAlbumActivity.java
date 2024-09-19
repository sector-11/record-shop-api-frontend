package com.northcoders.recordshopapp.ui.addalbum;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import com.northcoders.recordshopapp.R;
import com.northcoders.recordshopapp.databinding.ActivityAddNewAlbumBinding;
import com.northcoders.recordshopapp.model.Album;
import com.northcoders.recordshopapp.ui.mainactivity.MainActivityViewModel;

public class AddNewAlbumActivity extends AppCompatActivity {
    Album album;
    ActivityAddNewAlbumBinding activityAddNewAlbumBinding;
    MainActivityViewModel mainActivityViewModel;
    AddAlbumClickHandler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_new_album);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        activityAddNewAlbumBinding = DataBindingUtil.setContentView(this, R.layout.activity_add_new_album);
        activityAddNewAlbumBinding.setAlbum(album);

        mainActivityViewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);

        handler = new AddAlbumClickHandler(album, this, mainActivityViewModel);
    }
}