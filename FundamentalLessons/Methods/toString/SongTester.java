package FundamentalLessons.Methods.toString;
public class SongTester {
    // public static void etc is on files you RUN
    public static void main(String[] args) {
        Song a = new Song("Enter Sandman","Metallica");
        Song b = new Song("Hey, it's me, it's verity","Horror Skunx");

        a.play();
        a.play();
        a.play();

        System.out.println(a.toString());
        System.out.println(a); //recognized that you put toString
        a.getPlays();
    }
}
