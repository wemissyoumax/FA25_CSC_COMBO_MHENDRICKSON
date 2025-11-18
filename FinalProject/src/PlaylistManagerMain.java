import java.util.Scanner;

public class PlaylistManagerMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Playlist myPlaylist = new Playlist();
        boolean running = true;

        while (running) {
            System.out.println("\n--- Playlist Manager ---");
            System.out.println("1. Add a song");
            System.out.println("2. Remove a song");
            System.out.println("3. Display all songs");
            System.out.println("4. Search for a song");
            System.out.println("5. Shuffle playlist");
            System.out.println("6. Sort songs by title");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = input.nextInt();
            input.nextLine();

            // 2. Handle menu selection
            switch (choice) {
                case 1: // Add song
                    System.out.print("Enter song title: ");
                    String title = input.nextLine();
                    System.out.print("Enter artist: ");
                    String artist = input.nextLine();
                    System.out.print("Enter genre: ");
                    String genre = input.nextLine();

                    Song newSong = new Song(title, artist, genre);
                    myPlaylist.addSong(newSong);
                    System.out.println("Song added!");
                    break;

                case 2: // Remove song
                    System.out.print("Enter title of song to remove: ");
                    String removeTitle = input.nextLine();
                    boolean removed = myPlaylist.removeSong(removeTitle);
                    if (removed) {
                        System.out.println("Song removed!");
                    } else {
                        System.out.println("Song not found.");
                    }
                    break;

                case 3: // Display songs
                    myPlaylist.displaySongs();
                    break;

                case 4: // Search
                    System.out.print("Enter title to search: ");
                    String searchTitle = input.nextLine();
                    Song found = myPlaylist.searchSong(searchTitle);
                    if (found != null) {
                        System.out.println("Found: " + found);
                    } else {
                        System.out.println("Song not found.");
                    }
                    break;

                case 5: // Shuffle
                    myPlaylist.shuffle();
                    break;

                case 6: // Sort
                    myPlaylist.sortSongs();
                    break;

                case 7: // Exit
                    running = false;
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice, try again.");
                    break;
            }
        }

        input.close();
    }
} 
