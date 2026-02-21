
import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        ArrayList<Media> inventory =  new ArrayList<>();
        try{
            inventory = Manager.getInventory("project1dataset.csv");
            for(Media media : inventory){
                System.out.println(media);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("\nIn the inventory:");
        System.out.println("\tTotal products: " + Manager.totalInventory(inventory));
        System.out.println("\tMovies: " + Manager.totalMovies(inventory));
        System.out.println("\tTV shows: " + Manager.totalTVShows(inventory));
        System.out.println("\tVideo games: " + Manager.totalVideoGame(inventory));
        System.out.println("\tMusic albums: " + Manager.totalMusicAlbum(inventory));
        System.out.println("\tOldest product: " + Manager.oldestProduct(inventory) + " (" + Manager.oldestProductYear(inventory) + ")" );
        System.out.println("\tMost popular music album: " + Manager.mostPopularMA(inventory) + " (by " + Manager.mostPopularMAartist(inventory) + ")");
        System.out.println("\tMost popular video game: " + Manager.mostPopularVG(inventory) + " (" + Manager.mostPopularVGsales(inventory) + " million sales)");
        System.out.println("\tMost common rating: " + Manager.mostCommonRating(inventory));
        System.out.println("\tShortest movie: " + Manager.shortestMovie(inventory) + " (" + Manager.shortestMovieTime(inventory) + " min)");
        System.out.println("\tShortest music album: " + Manager.shortestMusicAlbum(inventory) + " by " + Manager.shortestMusicAlbumArtist(inventory) + " (" + Manager.shortestMusicAlbumTracks(inventory) + " tracks)");

    }

}