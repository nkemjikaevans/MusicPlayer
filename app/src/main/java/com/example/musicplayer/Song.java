package com.example.musicplayer;

import android.os.Parcel;
import android.os.Parcelable;

public class Song implements Parcelable {

    // The name of artist.
    private String mNameOfArtist;

    // The song.
    private String mSong;

    /**
     * Create a new Song object.
     *
     * @param nameOfArtist is the name of Artist.
     * @param song is the name of song.
     */
    public Song(String nameOfArtist, String song) {
        mNameOfArtist = nameOfArtist;
        mSong = song;
    }

    // Get the name of Artist.
    public String getNameOfArtist() {
        return mNameOfArtist;
    }

    // Get the name of song.
    public String getSong() {
        return mSong;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.mNameOfArtist);
        dest.writeString(this.mSong);
    }

    private Song(Parcel in) {
        this.mNameOfArtist = in.readString();
        this.mSong = in.readString();
    }

    public static final Parcelable.Creator<Song> CREATOR = new Parcelable.Creator<Song>() {
        @Override
        public Song createFromParcel(Parcel source) {
            return new Song(source);
        }

        @Override
        public Song[] newArray(int size) {
            return new Song[size];
        }
    };
}
