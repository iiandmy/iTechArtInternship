import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {
        return this.addSong(new Song(title, duration));
    }

    public boolean addSong(Song song) {
        return songs.add(song);
    }

    public Song findSong(String title) {
        for (Song s : this.songs)
            if (s.getTitle().equals(title))
                return s;

        return null;
    }

    public boolean addToPlayList(int numberOfSong, LinkedList<Song> playlist) {
        return playlist.add(this.songs.get(numberOfSong));
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        return playlist.add(this.findSong(title));
    }
}
