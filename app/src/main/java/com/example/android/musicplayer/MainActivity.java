package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;

public class MainActivity extends AppCompatActivity {

    CardView playerCardView;
    CardView playlistsCardView;
    CardView albumsCardView;
    CardView settingsCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playerCardView = (CardView) findViewById(R.id.menuPlayer);
        playlistsCardView = (CardView) findViewById(R.id.menuPlaylists);
        albumsCardView = (CardView) findViewById(R.id.menuAlbums);
        settingsCardView = (CardView) findViewById(R.id.menuSettings);

        playerCardView.setOnClickListener(playerTextViewOnClickListener);
        playlistsCardView.setOnClickListener(playlistsTextViewOnClickListener);
        albumsCardView.setOnClickListener(albumsTextViewOnClickListener);
        settingsCardView.setOnClickListener(settingsTextViewOnClickListener);

    }

    final View.OnClickListener playlistsTextViewOnClickListener = new View.OnClickListener() {
        public void onClick(final View v) {
            openPlaylistsList(playlistsCardView);
        }
    };

    final View.OnClickListener playerTextViewOnClickListener = new View.OnClickListener() {
        public void onClick(final View v) {
            openPlayerList(playerCardView);
        }
    };

    final View.OnClickListener albumsTextViewOnClickListener = new View.OnClickListener() {
        public void onClick(final View v) {
            openAlbumsList(albumsCardView);
        }
    };

    final View.OnClickListener settingsTextViewOnClickListener = new View.OnClickListener() {
        public void onClick(final View v) {
            openSettingsList(settingsCardView);
        }
    };

    public void openAlbumsList(View view) {
        Intent intent = new Intent(this, AlbumsActivity.class);
        startActivity(intent);
    }

    public void openPlayerList(View view) {
        Intent intent = new Intent(this, PlayerActivity.class);
        startActivity(intent);
    }

    public void openPlaylistsList(View view) {
        Intent intent = new Intent(this, PlaylistsActivity.class);
        startActivity(intent);
    }

    public void openSettingsList(View view) {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }

}
