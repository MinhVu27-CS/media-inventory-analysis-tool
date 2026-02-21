import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileInputStream;
public class Manager {
    public static ArrayList<Media> getInventory(String fileName) throws IOException {
        FileInputStream fis = new FileInputStream(fileName);
        Scanner fisScan = new Scanner(fis);
        ArrayList<Media> medias = new ArrayList<>();
        while (fisScan.hasNextLine()) {
            String line = fisScan.nextLine();
            String[] parts = line.split(",");
            int id = Integer.parseInt(parts[0].trim());
            String type = parts[1].trim();
            switch (type) {
                case "Movie":
                    String titleM = parts[2].trim();
                    String directorM = parts[3].trim();
                    String countryM = parts[4].trim();
                    int releaseYearM = Integer.parseInt(parts[5].trim());
                    String ratingM = parts[6].trim();
                    int durationMinutesM = Integer.parseInt(parts[7].trim());
                    String descriptionM = parts[8].trim();
                    medias.add(new Movie(id, type, titleM, directorM, countryM, releaseYearM, ratingM, durationMinutesM, descriptionM));
                    break;
                case "TV Show":
                    String titleTV = parts[2].trim();
                    String directorTV = parts[3].trim();
                    String countryTV = parts[4].trim();
                    int releaseYearTV = Integer.parseInt(parts[5].trim());
                    String ratingTV = parts[6].trim();
                    String numOfSeasonsTV = parts[7].trim();
                    String descriptionTV = parts[8].trim();
                    medias.add(new TVShow(id, type, titleTV, directorTV, countryTV, releaseYearTV, ratingTV, numOfSeasonsTV, descriptionTV));
                    break;
                case "Video Game":
                    String titleVG = parts[2].trim();
                    String platformVG = parts[3].trim();
                    int releaseYearVG = Integer.parseInt(parts[4].trim());
                    String genreVG = parts[5].trim();
                    String publisherVG = parts[6].trim();
                    double copiesSoldMillionsVg = Double.parseDouble(parts[7].trim());
                    medias.add(new VideoGame(id, type, titleVG, platformVG, releaseYearVG, genreVG, publisherVG, copiesSoldMillionsVg));
                    break;
                case "Music Album":
                    int releaseYearMA =  Integer.parseInt(parts[2].trim());
                    String artistMA = parts[3].trim();
                    String titleMA = parts[4].trim();
                    int globalSalesMA = Integer.parseInt(parts[5].trim());
                    int tracksMA = Integer.parseInt(parts[6].trim());
                    double durationMinutesMA = Double.parseDouble(parts[7].trim());
                    String genreMA = parts[8].trim();
                    medias.add(new MusicAlbum(id, type, releaseYearMA, artistMA, titleMA, globalSalesMA, tracksMA, durationMinutesMA, genreMA));
                    break;
            }

        }
        return medias;
    }
    public static int totalInventory(ArrayList<Media> medias) {
        return medias.size();
    }
    public static int totalMovies(ArrayList<Media> medias) {
        int totalMovies = 0;
        for (int i= 0; i<medias.size(); i++) {
            if (medias.get(i) instanceof Movie) {
                totalMovies++;
            }
        }
        return totalMovies;
    }
    public static int totalTVShows(ArrayList<Media> medias) {
        int totalTVShows = 0;
        for (int i= 0; i<medias.size(); i++) {
            if (medias.get(i) instanceof TVShow) {
                totalTVShows++;
            }
        }
        return  totalTVShows;
    }
    public static int totalVideoGame(ArrayList<Media> medias) {
        int totalVideoGame = 0;
        for (int i= 0; i<medias.size(); i++) {
            if (medias.get(i) instanceof VideoGame) {
                totalVideoGame++;
            }
        }
        return totalVideoGame;
    }
    public static int totalMusicAlbum(ArrayList<Media> medias) {
        int totalMusicAlbum = 0;
        for (int i= 0; i<medias.size(); i++) {
            if (medias.get(i) instanceof MusicAlbum) {
                totalMusicAlbum++;
            }
        }
        return totalMusicAlbum;
    }
    public static String oldestProduct(ArrayList<Media> medias) {
        String oldestProduct = "";
        int oldestYear = Integer.MAX_VALUE;
        for (int i= 0; i<medias.size(); i++) {
            if (medias.get(i).get_ReleaseYear() <  oldestYear) {
                oldestYear = medias.get(i).get_ReleaseYear();
                oldestProduct = medias.get(i).get_Title();
            }
        }
        return oldestProduct;
    }
    public static int oldestProductYear(ArrayList<Media> medias) {
        String oldestProduct = "";
        int oldestYear = Integer.MAX_VALUE;
        for (int i= 0; i<medias.size(); i++) {
            if (medias.get(i).get_ReleaseYear() <  oldestYear) {
                oldestYear = medias.get(i).get_ReleaseYear();
                oldestProduct = medias.get(i).get_Title();
            }
        }
        return oldestYear;
    }
    public static String mostPopularMA(ArrayList<Media> medias) {
        String mostPopularMA = "";
        int salesMA = 0;
        for (int i= 0; i<medias.size(); i++) {
            if (medias.get(i) instanceof MusicAlbum) {
                if (((MusicAlbum) medias.get(i)).get_GlobalSales() > salesMA) {
                    mostPopularMA = medias.get(i).get_Title();
                    salesMA = ((MusicAlbum) medias.get(i)).get_GlobalSales();
                }
            }
        }
        return (mostPopularMA);
    }
    public static String mostPopularMAartist(ArrayList<Media> medias) {
        String mostPopularMAartist = "";
        int salesMA = 0;
        for (int i= 0; i<medias.size(); i++) {
            if (medias.get(i) instanceof MusicAlbum) {
                if (((MusicAlbum) medias.get(i)).get_GlobalSales() > salesMA) {
                    mostPopularMAartist = ((MusicAlbum) medias.get(i)).get_Artist();
                    salesMA = ((MusicAlbum) medias.get(i)).get_GlobalSales();
                }
            }
        }
        return (mostPopularMAartist);
    }
    public static String mostPopularVG(ArrayList<Media> medias) {
        String mostPopularVG = "";
        double salesVG = 0.0;
        for (int i= 0; i<medias.size(); i++) {
            if (medias.get(i) instanceof VideoGame) {
                if (((VideoGame) medias.get(i)).get_CopiesSoldInMillions() > salesVG){
                    salesVG = ((VideoGame) medias.get(i)).get_CopiesSoldInMillions();
                    mostPopularVG = medias.get(i).get_Title();
                }
            }
        }
        return (mostPopularVG);
    }
    public static double mostPopularVGsales(ArrayList<Media> medias) {
        double salesVG = 0.0;
        for (int i= 0; i<medias.size(); i++) {
            if (medias.get(i) instanceof VideoGame) {
                if (((VideoGame) medias.get(i)).get_CopiesSoldInMillions() > salesVG){
                    salesVG = ((VideoGame) medias.get(i)).get_CopiesSoldInMillions();
                }
            }
        }
        return (salesVG);
    }
    public static String mostCommonRating(ArrayList<Media> medias) {
        String mostCommonRating = "";
        int pg13 = 0;
        int tvma = 0;
        int tv14 = 0;
        int tvpg = 0;
        int tvy7 = 0;
        for (int i= 0; i<medias.size(); i++) {
            if (medias.get(i) instanceof Movie) {
                if (((Movie) medias.get(i)).get_rating().equals("PG-13")){
                    pg13++;
                }
                else if  (((Movie) medias.get(i)).get_rating().equals("TV-MA")){
                    tvma++;
                }
                else if (((Movie) medias.get(i)).get_rating().equals("TV-14")){
                    tv14++;
                }
                else if (((Movie) medias.get(i)).get_rating().equals("TV-PG")){
                    tvpg++;
                }
                else if (((Movie) medias.get(i)).get_rating().equals("TV-Y7")){
                    tvy7++;
                }
            }
            if (medias.get(i) instanceof TVShow) {
                if (((TVShow) medias.get(i)).get_rating().equals("PG-13")){
                    pg13++;
                }
                else if (((TVShow) medias.get(i)).get_rating().equals("TV-MA")){
                    tvma++;
                }
                else if (((TVShow) medias.get(i)).get_rating().equals("TV-14")){
                    tv14++;
                }
                else if (((TVShow) medias.get(i)).get_rating().equals("TV-PG")){
                    tvpg++;
                }
                else if (((TVShow) medias.get(i)).get_rating().equals("TV-Y7")){
                    tvy7++;
                }
            }
        }
        if (pg13 > tvpg && pg13 > tvma && pg13 > tvy7 && pg13 > tv14){
            mostCommonRating = "PG-13";
        }
        else if(tvpg > pg13 && tvpg > tvma && tvpg > tvy7 && tvpg > tv14){
            mostCommonRating = "TV-PG";
        }
        else if(tvma > pg13 && tvpg < tvma && tvma > tvy7 && tvma > tv14){
            mostCommonRating = "TV-MA";
        }
        else if(tvy7 > pg13 && tvy7 > tvma && tvpg < tvy7 && tvy7 > tv14){
            mostCommonRating = "TV-Y7";
        }
        else {
            mostCommonRating = "TV-14";
        }
        return  mostCommonRating;
    }
    public static String shortestMovie(ArrayList<Media> medias) {
        String shortestMovie = "";
        int movielength = Integer.MAX_VALUE;
        for (int i= 0; i<medias.size(); i++) {
            if (medias.get(i) instanceof Movie) {
                if (((Movie)medias.get(i)).get_duration() < movielength ){
                    shortestMovie = ((Movie)medias.get(i)).get_Title();
                    movielength = ((Movie)medias.get(i)).get_duration();
                }
            }
        }
        return shortestMovie;
    }
    public static int shortestMovieTime(ArrayList<Media> medias) {
        int movielength = Integer.MAX_VALUE;
        for (int i= 0; i<medias.size(); i++) {
            if (medias.get(i) instanceof Movie) {
                if (((Movie)medias.get(i)).get_duration() < movielength ){
                    movielength = ((Movie)medias.get(i)).get_duration();
                }
            }
        }
        return movielength;
    }
    public static String shortestMusicAlbum(ArrayList<Media> medias) {
        String shortestMusicAlbum = "";
        int numTracks = Integer.MAX_VALUE;
        for (int i= 0; i<medias.size(); i++) {
            if (medias.get(i) instanceof MusicAlbum) {
                if (((MusicAlbum) medias.get(i)).get_Tracks() < numTracks ){
                    numTracks = ((MusicAlbum) medias.get(i)).get_Tracks();
                    shortestMusicAlbum = ((MusicAlbum) medias.get(i)).get_Title();
                }
            }
        }
        return shortestMusicAlbum;
    }
    public static int shortestMusicAlbumTracks(ArrayList<Media> medias) {
        int numTracks = Integer.MAX_VALUE;
        for (int i= 0; i<medias.size(); i++) {
            if (medias.get(i) instanceof MusicAlbum) {
                if (((MusicAlbum) medias.get(i)).get_Tracks() < numTracks ){
                    numTracks = ((MusicAlbum) medias.get(i)).get_Tracks();
                }
            }
        }
        return numTracks;
    }
    public static String shortestMusicAlbumArtist(ArrayList<Media> medias) {
        String shortestMusicAlbumArtist = "";
        int numTracks = Integer.MAX_VALUE;
        for (int i= 0; i<medias.size(); i++) {
            if (medias.get(i) instanceof MusicAlbum) {
                if (((MusicAlbum) medias.get(i)).get_Tracks() < numTracks ){
                    numTracks = ((MusicAlbum) medias.get(i)).get_Tracks();
                    shortestMusicAlbumArtist = ((MusicAlbum) medias.get(i)).get_Artist();
                }
            }
        }
        return shortestMusicAlbumArtist;
    }
}
