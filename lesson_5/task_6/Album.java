public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double direction) {
        return this.addSong(new Song(title, direction));
    }

    public boolean addSong(Song song) {
        return songs.add(song);
    }

    public Song findSong(String title) {
        return this.songs.;
    }
}
