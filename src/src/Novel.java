import java.util.ArrayList;

public class Novel extends Book{

    private String genre;

    public Novel() {

    }

    public Novel(String title, String author, String ISBN, double price, int stock, ArrayList<Review> review, String genre) {
        super(title, author, ISBN, price, stock, review);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getMediaType() {
        if(super.isBestSeller())
            return "Bestselling Novel";
        else
            return "Novel";
    }



    @Override
    public String toString() {
        return "{Novel Name: " + this.getTitle() +
                " genre: " + genre +
                '}';
    }
}
