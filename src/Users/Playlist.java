package Users;

import Songs.Song;

import java.util.ArrayList;

public class Playlist {
    private int playlistID;
    private String playlistName;
    private ArrayList<Song> playlist;
    private ArrayList<Integer> likes;

    public Playlist(int playlistID, String playlistName, ArrayList<Song> playlist, boolean is_Liked, ArrayList<Integer> likes) {
        this.playlistID = playlistID;
        this.playlistName = playlistName;
        this.playlist = null;
        this.likes = null;
    }

    public Playlist(int playlistID, String playlistName, ArrayList<Song> playlist, ArrayList<Integer> likes) {
        this.playlistID = playlistID;
        this.playlistName = playlistName;
        this.playlist = null;
        this.likes = null;
    }

    public int getPlaylistID() {
        return playlistID;
    }

    public void setPlaylistID(int playlistID) {
        this.playlistID = playlistID;
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }

    public ArrayList<Song> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(ArrayList<Song> playlist) {
        this.playlist = playlist;
    }

    public ArrayList<Integer> get_Total_Likes() {
        return likes;
    }

    public void setLikes(ArrayList<Integer> likes) {
        this.likes = likes;
    }

    public int count_Playlist(Playlist playlist, Song song){
        return 0;
    }
}
