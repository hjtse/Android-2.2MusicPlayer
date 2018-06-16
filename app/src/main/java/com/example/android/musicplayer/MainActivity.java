package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.v7.widget.CardView;

public class MainActivity extends AppCompatActivity {

    CardView playerCardView;
    CardView playlistsCardView;
    CardView albumsCardView;
    CardView artistsCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playerCardView = (CardView) findViewById(R.id.menuPlayer);
        playlistsCardView = (CardView) findViewById(R.id.menuPlaylists);
        albumsCardView = (CardView) findViewById(R.id.menuAlbums);
        artistsCardView = (CardView) findViewById(R.id.menuArtists);

        playerCardView.setOnClickListener(playerTextViewOnClickListener);
        playlistsCardView.setOnClickListener(playlistsTextViewOnClickListener);
        albumsCardView.setOnClickListener(albumsTextViewOnClickListener);
        artistsCardView.setOnClickListener(artistTextViewOnClickListener);

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

    final View.OnClickListener artistTextViewOnClickListener = new View.OnClickListener() {
        public void onClick(final View v) {
            openArtistsList(artistsCardView);
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
        Intent intent = new Intent(this, SongsActivity.class);
        startActivity(intent);
    }

    public void openArtistsList(View view) {
        Intent intent = new Intent(this, ArtistsActivity.class);
        startActivity(intent);
    }

}
