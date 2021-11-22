import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private final String name;
    private final String artist;
    private final SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        return this.addSong(new Song(title, duration));
    }

    public boolean addSong(Song song) {
        return this.songs.addSong(song);
    }

    public Song findSong(String title) {
        return this.songs.findSong(title);
    }

    public Song findSong(int songIndex) {
        return this.songs.findSong(songIndex);
    }

    public boolean addToPlayList(int numberOfSong, LinkedList<Song> playlist) {
        return playlist.add(this.findSong(numberOfSong));
    }

    public void addToPlayList(String title, LinkedList<Song> playlist) {
        playlist.add(this.findSong(title));
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    private class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<>();
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

        public Song findSong(int songIndex) {
            return this.songs.get(songIndex);
        }
    }
}
