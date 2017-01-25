package com.kdtech.suppernatural.jsondemo;

/**
 * Created by kusha_000 on 25-01-2017.
 */

public class event {
    private String title, genre;

    public event() {
    }

    public event(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }


    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
