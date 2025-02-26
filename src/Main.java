import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        User user

        ArrayList<Review> reviews1 = new ArrayList<>(List.of(new Review("Khaled", 9, "Great Book"),
                                                            new Review("Ahmed", 7, "Good book"),
                                                            new Review("Mohammed", 4, "Bad book")));

        ArrayList<Review> reviews2 = new ArrayList<>(List.of(new Review("Rashid", 4, "not recommended"),
                                                             new Review("Ali", 10, "Best book I've read in my life")));


        Book book1 = new Book("The psychology of the money", "Morgan Housel", "a222", 50, 12, reviews1);
        System.out.println(book1.toString());
        System.out.println("Book 1 Average Rating: " + book1.getAverageRating());
        System.out.println(book1.getStock());
        book1.addReview(new Review("Saleh", 1, "Worst Book in the world"));
        System.out.println(book1.getReview());
        System.out.println(book1.getAverageRating());
        System.out.println("Book 1 Author: " + book1.getAuteur());
        Book book2 = new Book(45, reviews1);
        book2.setReview(reviews2);

        System.out.println("------------------------------------------------------------------------------------------------------------------");


        Movie movie1 = new Movie();
        Movie movie2 = new Movie("The dark knight", "nolan", "1234h", 80, 220);
        System.out.println(movie2.getMediaType());
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        movie1.setAuteur("nolan");
        movie1.setTitle("something");
        System.out.println(movie2.recommendSimilarMovies(movies));

        System.out.println("---------------------------------------------------------------------------------------------------------");

        Music music1 = new Music("song1", "singer1", "1344f",23,"artist1");
        Music music2 = new Music("song2", "singer2", "1347f",44,"artist1");

        ArrayList<Music> playList = new ArrayList<>();
        playList.add(music1);
        playList.add(music2);
        System.out.println("Music 1 Artist: " + music1.getArtist());
        System.out.println(music1.getMediaType());
        System.out.println(music2.generatePlayList(playList));

        System.out.println("-------------------------------------------------------------------------------------------------------------");
        ArrayList<Media> purchased = new ArrayList<>();
        purchased.add(book1);
        purchased.add(book2);
        purchased.add(movie1);
       // purchased.add(movie2);
        purchased.add(music1);
        //purchased.add(music2);

        ArrayList<Media> shopping = new ArrayList<>();
        shopping.add(music2);
        shopping.add(movie2);
        User user = new User("Khaled", "khaled@gmail.com", purchased, shopping);
        System.out.println(user.getPurchaseMediaList());

        user.addToCart(new Movie("Movie3" , "tarantino","44343d", 34, 200));
        System.out.println(user.getShoppingCart());


    }
}