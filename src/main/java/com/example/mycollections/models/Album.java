package com.example.mycollections.models;

public class Album  extends LibraryItem{
    private String artist;
    private String albumName;
    private int tracks;

    public Album(String name, int year, String artist, String albumName, int tracks) {
        super(name, year);
        this.artist = artist;
        this.albumName = albumName;
        this.tracks = tracks;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public int getTracks() {
        return tracks;
    }

    public void setTracks(int tracks) {
        this.tracks = tracks;
    }

    @Override
    public String toString() {
        return "Album{" +
                "artist='" + artist + '\'' +
                ", albumName='" + albumName + '\'' +
                ", tracks=" + tracks +
                '}';
    }
}
