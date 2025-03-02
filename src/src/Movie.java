import java.util.ArrayList;
import java.util.List;

public class Movie extends Media{
    private int duration;

    public Movie() {

    }
    public Movie(int duration) {
        this.duration = duration;
    }

    public Movie(String title, String auteur, String ISBN, double price, int duration) {
        super(title, auteur, ISBN, price);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void watch(User user) {
        user.getPurchaseMediaList().add(new Movie());
    }
    public List<Movie> recommendSimilarMovies(List<Movie> movieCatalog) {
        ArrayList<Movie> recommendMovies = new ArrayList<>();
        for(Movie movie : movieCatalog) {
            if(movie.getAuteur().equals(this.getAuteur())) {
            recommendMovies.add(movie);
            }
        }
        return recommendMovies;
    }

    public String getMediaType(){
        if(duration >= 120)
            return "Long Movie";
        else return "Move";
    }


    @Override
    public String toString() {
        return "{Movie Name: " + this.getTitle() +
                " duration: " + duration +
                '}';
    }
}
