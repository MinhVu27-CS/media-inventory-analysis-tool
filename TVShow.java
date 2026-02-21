public class TVShow extends Media {
    private String director;
    private String country;
    private String rating;
    private String description;
    private String numOfSeasons;

    // constructor: id,type,title,director,country,release_year,rating,number_of_seasons,description
    public TVShow(){
        super();
        this.director = "";
        this.country = "";
        this.rating = "";
        this.description = "";
        this.numOfSeasons = "";
    }
    public TVShow (int id, String type, String title, String director, String country, int releaseYear, String rating, String numOfSeasons, String description) {
        super(id, type, title, releaseYear);
        this.director = director;
        this.country = country;
        this.rating = rating;
        this.description = description;
        this.numOfSeasons = numOfSeasons;
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
    public String get_NumOfSeasons(){
        return this.numOfSeasons;
    }
    public void set_numOfSeasons(String numOfSeasons){
        this.numOfSeasons = numOfSeasons;
    }
    public String get_description(){
        return this.description;
    }
    public void set_description(String description){
        this.description = description;
    }

    @Override
    public String toString(){
        return("ID: " + get_Id() + " | Type: " + get_Type() + " | Title: " + get_Title() + " | Director: " + director + " | Country: " + country + " | Release Year: " + get_ReleaseYear() + " | Rating: " + rating + " | Description: " + rating + " | Number of Seasons: " + numOfSeasons + " | Description: " + description );
    }
}
