package FundamentalLessons.Methods.toString;
// Song: Blueprint for song objects. New Method: toString()
// toString() returns a String that describes an object. Header -- Copy it exactly: public String toString(). It RETURNS text. It does not print
public class Song {
    // ATTRIBUTES. instance Variables.... hold data for each song INSTANCE

    private String title;
    private String artist;
    private int plays;

    // Constructor
    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
        plays = 0;

    }

    // Methods. Behaviors
// Setter and Getter
    public void play() {
        plays++;
    }

    public int getPlays() {
        System.out.println(plays);
        return plays;
    }
    public String toString() 
    {
        
        return title + " by " + artist + " - " + plays + "plays";
    }
}
