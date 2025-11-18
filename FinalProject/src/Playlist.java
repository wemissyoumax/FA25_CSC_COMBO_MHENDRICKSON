import java.util.ArrayList;
import java.util.Collections;

public class Playlist {

    private ArrayList<Song> songs;

    public Playlist() {
        songs = new ArrayList<>();
    }

    public void addSong(Song song) {
    	songs.add(song);
    }

    public boolean removeSong(String title) {
        for (int i = 0; i < songs.size(); i ++) {
        	Song current = songs.get(i);
        	if (current.getTitle().equalsIgnoreCase(title)) {
        		songs.remove(i);
        		return true;
        	}
        }
        return false; // if nothing matched
    }

    public void displaySongs() {
        if (songs.isEmpty()) {
        	System.out.println("The current playlist is empty.");
        	return;
        }
        
        for (Song s : songs) {
        	System.out.println(s);
        }
    }

    public Song searchSong(String title) {
        for (Song s : songs) {
            if (s.getTitle().equalsIgnoreCase(title)) {
                return s;
            }
        }
        return null;
    }



    public void shuffle() {
        if (songs.isEmpty()) {
            System.out.println("Cannot shuffle — playlist is empty.");
            return;
        }
        Collections.shuffle(songs);
        System.out.println("Playlist shuffled!");
    }
    
    public void sortSongs() {
        Collections.sort(songs, (a, b) -> a.getTitle().compareToIgnoreCase(b.getTitle()));
    }


}
