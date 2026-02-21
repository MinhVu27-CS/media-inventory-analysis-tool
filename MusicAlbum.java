public class MusicAlbum extends Media{
    private double durationMinutes;
    private String genre;
    private String artist;
    private int globalSales;
    private int tracks;

    //constructor: id,type,release_year,artist,title,global_sales,tracks,duration_(minutes),genre
    public MusicAlbum(){
        super();
        this.durationMinutes = 0;
        this.genre = "";
        this.artist = "";
        this.globalSales = 0;
        this.tracks = 0;
    }
    public MusicAlbum(int id, String type, int releaseYear, String artist, String title, int globalSales, int tracks, double durationMinutes, String genre) {
        super(id, type, title, releaseYear);
        this.durationMinutes = durationMinutes;
        this.genre = genre;
        this.artist = artist;
        this.globalSales = globalSales;
        this.tracks = tracks;
    }

    // getter setter methods
    public double get_DurationMinutes() {
        return durationMinutes;
    }
    public void set_DurationMinutes(double durationMinutes) {
        this.durationMinutes = durationMinutes;
    }
    public String get_Genre() {
        return genre;
    }
    public void set_Genre(String genre) {
        this.genre = genre;
    }
    public String get_Artist() {
        return artist;
    }
    public void set_Artist(String artist) {
        this.artist = artist;
    }
    public int get_GlobalSales() {
        return globalSales;
    }
    public void set_GlobalSales(int globalSales) {
        this.globalSales = globalSales;
    }
    public int get_Tracks() {
        return tracks;
    }
    public void set_Tracks(int tracks) {
        this.tracks = tracks;
    }

    @Override
    public String toString() {
        return ("ID: " + get_Id() + " | Type: " + get_Type() + " | Release Year: " + get_ReleaseYear() + " | Artist: " + artist + " | Title: " + get_Title() + " | Global Sales: " + globalSales + " | Tracks: " + tracks + " | Duration: " + durationMinutes + " minutes | Genre: " + genre);
    }
}
