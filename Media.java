public class Media {
    private int id;
    private String type;
    private String title;
    private int releaseYear;

    //basic constructor
    public Media (){
        this.id = 0;
        this.type = "";
        this.title = "";
        this.releaseYear = 0;
    }
    public Media (int id, String type, String title, int releaseYear) {
        this.id = id;
        this.type = type;
        this.title = title;
        this.releaseYear = releaseYear;
    }

    // getter setter methods
    public int get_Id() {
        return id;
    }
    public void set_Id(int id) {
        this.id = id;
    }
    public String get_Type() {
        return type;
    }
    public void set_Type(String type) {
        this.type = type;
    }
    public String get_Title() {
        return title;
    }
    public void set_Title(String title) {
        this.title = title;
    }
    public int get_ReleaseYear() {
        return releaseYear;
    }
    public void set_ReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    //to string
    @Override
    public String toString() {
        return("ID: " + id + "\nType: " + type + "\nTitle: " + title + "\nYear: " + releaseYear);
    }

}
