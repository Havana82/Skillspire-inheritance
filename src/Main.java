import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cast = new ArrayList<>();
        cast.add("Jack");
        cast.add("Rose");
        cast.add("Freddie");
      Media media = new Media("The Titanic", "PG", "James Cameron", cast);
      System.out.println(media.getCast());
      System.out.println(media.getDirector());

      Movie movie = new Movie("Forest Gump", "PG", "Robert Zemekis", cast,
              2, "A large ship that sinks", 3.5);
        System.out.println(movie.getTitle());
        System.out.println(movie.getDirector());

      TvShow tvShow = new TvShow("Friends", "PG", "James Burrows", cast, 10, 155);
        System.out.println(tvShow.getTitle());
        System.out.println(tvShow.getDirector());
        System.out.println(tvShow.getEpisodes());
    }
}