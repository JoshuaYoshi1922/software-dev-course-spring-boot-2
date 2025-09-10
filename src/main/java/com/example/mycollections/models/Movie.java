package com.example.mycollections.models;

public class Movie extends LibraryItem{
    private String title;
    private int minutes;
    private String director;

    public Movie(String name, int year, String title, int minutes, String director) {
        super(name, year);
        this.title = title;
        this.minutes = minutes;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", minutes=" + minutes +
                ", director='" + director + '\'' +
                '}';
    }
}
