import java.util.ArrayList;

public class User {
    private int id;
    private String name;
    private ArrayList<Song> playlist;

    public User(int id, String name, ArrayList<Song> playlist) {
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

    public ArrayList<Song> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(ArrayList<Song> playlist) {
        this.playlist = playlist;
    }
}
