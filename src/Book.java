import java.util.ArrayList;
import java.util.Arrays;

public class Book extends Media{
    private int stock;
    private ArrayList<Review> reviews;

    public Book() {

    }
    public Book(int stock, ArrayList<Review> review) {
        this.stock = stock;
        this.reviews = review;
    }

    public Book(String title, String author, String ISBN, double price, int stock, ArrayList<Review> review) {
        super(title, author, ISBN, price);
        this.stock = stock;
        this.reviews = review;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public ArrayList<Review> getReview() {
        return reviews;
    }

    public void setReview(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public void addReview(Review r){
        reviews.add(r);
    }
    public double getAverageRating() {
        double averageRating = 0;
        for(Review r : reviews) {
            averageRating += ((double) r.getRating() / reviews.size());

        }
        return averageRating;
    }

    public void purchase(User user){
        if(stock > 0) {
            user.getPurchaseMediaList().add(new Book());
            stock--;
        }
    }
    public boolean isBestSeller() {
        return getAverageRating() >= 4.5;
    }

    public void restock(int quantity) {
        stock+=quantity;
        System.out.println(quantity + " Added to the stock");
    }
    public String getMediaType() {
        if(isBestSeller())
            return "Bestselling Book";
        else
            return "Book";

    }

    @Override
    public String toString() {
        return "Book Name: " + this.getTitle();

    }
}
