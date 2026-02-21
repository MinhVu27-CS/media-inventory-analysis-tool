public class VideoGame extends Media{
    private String platform;
    private String genre;
    private String publisher;
    private double copiesSoldInMillions;

    // constructor: id,type,title,platform,release_year,genre,publisher,copies_sold_(millions)
    public VideoGame(){
        super();
        platform = "";
        genre = "";
        publisher = "";
        copiesSoldInMillions = 0.0;
    }

    public VideoGame(int id, String type, String title, String platform, int releaseYear, String genre, String publisher, double copiesSoldInMillions){
        super(id, type, title, releaseYear);
        this.platform = platform;
        this.genre = genre;
        this.publisher = publisher;
        this.copiesSoldInMillions = copiesSoldInMillions;
    }

    // getter setter methods
    public String get_Platform() {
        return platform;
    }
    public void set_Platform(String platform) {
        this.platform = platform;
    }
    public String get_Genre() {
        return genre;
    }
    public void set_Genre(String genre) {
        this.genre = genre;
    }
    public String get_Publisher() {
        return publisher;
    }
    public void set_Publisher(String publisher) {
        this.publisher = publisher;
    }
    public double get_CopiesSoldInMillions() {
        return copiesSoldInMillions;
    }
    public void set_CopiesSoldInMillions(double copiesSoldInMillions) {
        this.copiesSoldInMillions = copiesSoldInMillions;
    }

    @Override
    public String toString() {
        return ("ID: " + get_Id() + " | Type: " + get_Type() + " | Title: " + get_Title() + " | Platform: " + platform + " | Release Year: " + get_ReleaseYear() + " | Genre: " + genre + " | Publisher: " + publisher + " | Copies Sold: " + copiesSoldInMillions + " million");
    }
}
