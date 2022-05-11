package com.example.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player);

        playing();
    }

    public void playing() {
        // Get extras from Intent.
        Intent songIntent = getIntent();

        // Set the name of song for playing.
        TextView songTextView = findViewById(R.id.player_song);
        String songPlaying = songIntent.getStringExtra("song");
        songTextView.setText(songPlaying);

        // Set the name of artist for playing.
        TextView artistTextView = findViewById(R.id.player_artist);
        String artistPlaying = songIntent.getStringExtra("Artist");
        artistTextView.setText(artistPlaying);
    }
}