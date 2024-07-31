package Songs;

import java.util.ArrayList;

public class Album extends Song{
    private ArrayList<Song> album;

    public Album(ArrayList<Song> album) {
        this.album = album;
    }
}
