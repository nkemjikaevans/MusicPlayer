package com.example.musicplayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;


public class SongAdapter extends ArrayAdapter<Song>{

    SongAdapter(Context context, ArrayList<Song> object) {
        super(context, 0, object);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list, parent, false);
        }

        // Get the {@link Song} object located at this position in the list
        Song currentWord= getItem(position);

        // Find the TextView in the list.xml layout with the ID song_text_view
        TextView songTextView = listItemView.findViewById(R.id.song_text_view);
        // Get the name of song from the current song object and
        // set this text on the name TextView
        songTextView.setText(currentWord.getSong());

        // Find the TextView in the list_item.xml layout with the ID artist_text_view
        TextView artistTextView = listItemView.findViewById(R.id.artist_text_view);
        // Get the name of the composer from the current opus object and
        // set this text on the name TextView
        artistTextView.setText(currentWord.getNameOfArtist());

        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
