import java.util.ArrayList;

public class Media {
    protected String title;
    protected String rating;
//    (movie ratings will be R, PG, or PG-13 while tv shows will be Y, G, PG, or MA)
    protected String director;
    protected ArrayList<String> cast = new ArrayList<>();

    Media(String title, String rating, String director, ArrayList<String> cast) {
        this.title = title;
        this.rating = rating;
        this.director = director;
        this.cast = cast;

    }

    public String getTitle(){
        return title;
    }

    public String getRating(){
        return rating;
    }
    public String getDirector(){
        return director;
    }

    public ArrayList<String> getCast(){
        return cast;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setRating(String rating){
        this.rating = rating;
    }
    public void setDirector(String director){
        this.director = director;
    }

    public void setCast(ArrayList<String> cast){
        this.cast = cast;
    }
}
