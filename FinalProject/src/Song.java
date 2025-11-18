public class Song {

    // 1. Step: Declare your fields here:
     private String title;
     private String artist;
     private String genre;
	 
    // 2. Step: Write your constructor here.
	 public Song(String title, String artist, String genre) {
			this.title = title;
			this.artist = artist;
			this.genre = genre;
		 }

    // 3. Step: Write your getters next.
	 public String getTitle() {
		 return title;
	 }

	 public String getArtist() {
		 return artist;
	 }

	 public String getGenre() {
		 return genre;
	 }

    // 4. Step: Write your setters.
	 public void setTitle(String title) {
		 this.title = title;
	 }

	 public void setArtist(String artist) {
		 this.artist = artist;
	 }

	 public void setGenre(String genre) {
		 this.genre = genre;
	 }

    // 5. Step: Write your toString() method.
	 @Override
	 public String toString() {
		 return title + " by " + artist + " (" + genre + ")";

	 }  
		 
	 }


