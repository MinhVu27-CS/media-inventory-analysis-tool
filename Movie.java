public class Movie extends Media{
    private String director;
    private String country;
    private String rating;
    private int durationMinutes;
    private String description;

    // constructor: id,type,title,director,country,release_year,rating,duration_(minutes),description
    public Movie(){
        super();
        this.director = "";
        this.country = "";
        this.rating = "";
        this.description = "";
        this.durationMinutes = 0;
    }
    public Movie (int id, String type, String title, String director, String country, int releaseYear, String rating, int durationMinutes, String description) {
        super(id, type, title, releaseYear);
        this.director = director;
        this.country = country;
        this.rating = rating;
        this.durationMinutes = durationMinutes;
        this.description = description;
    }

    // getter setter methods
    public String get_director(){
        return this.director;
    }
    public void set_director(String director){
        this.director = director;
    }
    public String get_country(){
        return this.country;
    }
    public void set_country(String country){
        this.country = country;
    }
    public String get_rating(){
        return this.rating;
    }
    public void set_rating(String rating){
        this.rating = rating;
    }
    public int get_duration(){
        return this.durationMinutes;
    }
    public void set_duration(int durationMinutes){
        this.durationMinutes = durationMinutes;
    }
    public String get_description(){
        return this.description;
    }
    public void set_description(String description){
        this.description = description;
    }

    @Override
    public String toString(){
        return("ID: " + get_Id() + " | Type: " + get_Type() + " | Title: " + get_Title() + " | Director: " + director + " | Country: " + country + " | Release Year: " + get_ReleaseYear() + " | Rating: " + rating + " | Duration: " + durationMinutes + " minutes | Description: " + description);
    }
}
