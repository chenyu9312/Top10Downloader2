package com.example.lachia.top10downloader;

/**
 * Created by Lachia on 2016-02-17.
 */
public class Application {
    private String name;
    private String artist;
    private String releaseDate;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Name: " +getName()+"\n"+
                "Artist: "+getArtist()+"\n"+
                "Release Date"+getReleaseDate()+"\n";

    }
}
