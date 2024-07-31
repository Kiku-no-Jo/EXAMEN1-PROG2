package Songs;

import Artists.Artist;

import java.time.LocalDate;
import java.util.ArrayList;

public class Album{
    private int id;
    private String name;
    private Artist artist;
    private LocalDate releaseDate;
    private ArrayList<Song> album;

    public Album(int id, String name, Artist artist, LocalDate releaseDate, ArrayList<Song> album) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.releaseDate = releaseDate;
        this.album = album;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public ArrayList<Song> getAlbum() {
        return album;
    }

    public void setAlbum(ArrayList<Song> album) {
        this.album = album;
    }
}
