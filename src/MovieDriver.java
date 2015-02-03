/**
 * Created by Brandon on 2/1/15.
 * Class contains movie elements and methods to retrieve them
 */
import com.sun.tools.javac.util.Name;
import java.io.*;
import java.util.*;

public class MovieDriver {

    public static void main(String[] args){

        System.out.println("Welcome to Movie-rama");

        Movie m1 = new Movie("Gone Girl", 2014);
        Movie m2 = new Movie("Godzilla vs MechaGodzilla", 1962);
        Movie m3 = new Movie("Batman Begins", 2008);
        Movie m4 = new Movie("Flashdance", 1989);
        Movie m5 = new Movie("Lakehouse", 2001);

        Set<Movie> library = new HashSet<Movie>();
        Set<Movie> favorites = new HashSet<Movie>();
        Set<Movie> watched = new HashSet<Movie>();
        Set<Movie> recentlyWatched = new HashSet<Movie>();
        Set<Movie> comedies = new HashSet<Movie>();
        Set<Movie> dramas = new HashSet<Movie>();

        library.add(m1);
        library.add(m2);
        library.add(m3);
        library.add(m4);

        favorites.add(m1);
        favorites.add(m2);
        favorites.add(m3);

        watched.add(m1);
        watched.add(m3);
        watched.add(m2);

        recentlyWatched.add(m1);
        recentlyWatched.add(m3);

        comedies.add(m4);

        dramas.add(m1);
        dramas.add(m5);


        System.out.println("Library is " + library);
        System.out.println("Favorite is " + favorites);

        SetHelper helper = new SetHelper();

        //calc the intersection of watched dramas
        Set<Movie> watchedDramas = new HashSet<Movie>(watched);
        watchedDramas.retainAll(favorites);

        Set<Movie> unwatched = helper.difference(library, watched);

        Set<Movie> favoritedramas = helper.intersect(favorites,dramas);

        Set<Movie> unwatcheddramas = helper.intersect(dramas, unwatched);

        System.out.println(watchedDramas);

        favorites.clear();

        //Part 5
        // A map that associates number of views of a movie
        Map<Movie, Integer> movieViews = new HashMap<Movie, Integer>();


        // Example of putting two views of movie m1
        movieViews.put(m1,2);
        movieViews.put(m2,6);
        movieViews.put(m3,3);
        Queue<Movie> playList = new LinkedList<Movie>();


        // adds movie m1 to the end of playList
        playList.add(m1);
        playList.add(m2);
        playList.add(m3);

        //first movie in the playList
        Movie firstToPlay = playList.element();
        System.out.println("First movie in Playlist "+ firstToPlay);

        // removes the first movie in the playList
        System.out.println("Remove From Playlist: "+ playList.remove());

        // peek at the first movie in the playList
        firstToPlay = playList.element();
        System.out.println("First movie in Playlist: "+ firstToPlay);

        // removes the second movie which is now the first in the playList
        System.out.println("Remove: "+ playList.remove());

        // peek at the first movie in the playList
        firstToPlay = playList.element();
        System.out.println("First movie in Playlist: "+ firstToPlay);



    }
}
