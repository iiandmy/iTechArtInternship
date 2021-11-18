import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Album blackHabits = new Album("Black Habits", "D Smoke");
        blackHabits.addSong(new Song("Morning Prayer", 1.27d));
        blackHabits.addSong(new Song("Bullies", 4.14d));
        blackHabits.addSong(new Song("No Commas", 2.56d));
        LinkedList<Song> newPlaylist = new LinkedList<Song>();
        blackHabits.addToPlayList("Morning Prayer", newPlaylist);
        blackHabits.addToPlayList("Bullies", newPlaylist);
        blackHabits.addToPlayList("No Commas", newPlaylist);
        for (Song s : newPlaylist) {
            System.out.printf("%s - %.2f\n", s.getTitle(), s.getDuration());
        }
    }
}
