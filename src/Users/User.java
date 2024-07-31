package Users;

import Artists.Artist;
import Artists.Solo;
import Songs.Song;

import java.util.ArrayList;

public class User {
    private int id;
    private String name;
    private Playlist playlist;

    public User(int id, String name, Playlist playlist) {
        this.id = id;
        this.name = name;
        this.playlist = playlist;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Playlist getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }

    public void add_to_playlist(Song song, Playlist playlist, Artist artist) {
        Artist artist1 = new Artist(25, "Kera");
        Song song1 = new Song(1, "over the rain");
        Playlist playlist1 = new Playlist(3, "myfav", new ArrayList<>(), new ArrayList<>() );
        ArrayList<Song> container = playlist1.getPlaylist();
        container.add(song1);
    }

    public void remove_by_id(Song id, Playlist playlist) {
        Artist artist1 = new Artist(25, "Kera");
        Song song1 = new Song(1, "over the rain");
        Playlist playlist1 = new Playlist(3, "myfav", new ArrayList<>(), new ArrayList<>() );
        int target_id = song1.getId();
        ArrayList<Song> container = playlist1.getPlaylist();
        container.remove(target_id);
    }

    public void like(Playlist playlist) {}

    public Playlist exclude (Playlist playlist, Song genre) {
        return playlist;
    }


}
