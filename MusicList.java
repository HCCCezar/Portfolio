package com.example.musicplayerapplication;

import android.net.Uri;

public class MusicList {
    private String title,artist, duration;
    private Boolean isPlaying;
    private Uri musicFile;

    public MusicList(String title, String artist, String duration, Boolean isPlaying, Uri musicFile) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.isPlaying = isPlaying;
        this.musicFile = musicFile;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getDuration() {
        return duration;
    }

    public Boolean getPlaying() {
        return isPlaying;
    }

    public Uri getMusicFile() {
        return musicFile;
    }

    public void setPlaying(Boolean playing) {
        isPlaying = playing;
    }
}
