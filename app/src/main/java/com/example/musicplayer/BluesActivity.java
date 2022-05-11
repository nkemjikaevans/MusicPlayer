package com.example.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class BluesActivity extends AppCompatActivity implements ListView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playlist);


        // Create an array of songs.
        ArrayList<Song> songs = new ArrayList<>();

        // Adding songs to an array.
        songs.add(new Song(getString(R.string.royBrown), getString(R.string.goodRockinTonight)));
        songs.add(new Song(getString(R.string.robertJohnson), getString(R.string.loveInVain)));
        songs.add(new Song(getString(R.string.johnLeeHooker), getString(R.string.boomBoom)));
        songs.add(new Song(getString(R.string.robertJohnson), getString(R.string.sweetHomeChicago)));
        songs.add(new Song(getString(R.string.willieDixon), getString(R.string.iJustWantToMakeYouToYou)));
        songs.add(new Song(getString(R.string.juniorParker), getString(R.string.mysteryTrain)));
        songs.add(new Song(getString(R.string.johnnyCash), getString(R.string.cry)));
        songs.add(new Song(getString(R.string.slimHarpo), getString(R.string.iGotLOveIfYouWantIt)));
        songs.add(new Song(getString(R.string.littleWalker), getString(R.string.juke)));
        songs.add(new Song(getString(R.string.jimmyReed), getString(R.string.BrightLightsBigCity)));

        SongAdapter adapter = new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // playlist file.
        ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

        // Set OnClickListener on ListView to identify the item on ListView clicked by user
        // Text on the ListView item clicked is passed on to PlayerActivity
        listView.setOnItemClickListener(this);
    }

    /**
     * Method to identify ListView item clicked and launch PlayerActivity
     */
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        // Get the selected song.
        Song currentSong = (Song) adapterView.getItemAtPosition(position);

        // Extract strings from song object.
        String songPlaying = currentSong.getSong();
        String artistPlaying = currentSong.getNameOfArtist();

        // Sending the name of artist and his song to PlayerActivity.
        Intent songIntent = new Intent(this, PlayerActivity.class);
        songIntent.putExtra("song", songPlaying);
        songIntent.putExtra("Artist", artistPlaying);
        startActivity(songIntent);
    }
}