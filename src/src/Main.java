
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        ArrayList<Review> reviews1 = new ArrayList<>(List.of(new Review("Khaled", 9, "Great Book"),
                                                            new Review("Ahmed", 7, "Good book"),
                                                            new Review("Mohammed", 4, "Bad book")));

        ArrayList<Review> reviews2 = new ArrayList<>(List.of(new Review("Rashid", 4, "not recommended"),
                                                             new Review("Ali", 10, "Best book I've read in my life")));

        ArrayList<Review> reviews3 = new ArrayList<>(List.of(new Review("Sara", 9, "Amazing book"),
                                                            new Review("Saleh", 2, "an overrated book"),
                                                            new Review("Abdullrahman", 5, "Not worth the money") ));

        ArrayList<Review> reviews4 = new ArrayList<>(List.of(new Review("saud", 10, "such a great book"),
                                                            new Review("Ahmed", 2, "long book"),
                                                            new Review("Abdullrahman", 5, "Not worth the money")));

        ArrayList<Review> reviews5 = new ArrayList<>(List.of(new Review("Bander", 5, "mediocre book"),
                                                            new Review("Norah", 8, "I liked this book so much"),
                                                            new Review("Abdullaziz", 5, "Too much pages for such a simple topic") ));


        Book book1 = new Book("The psychology of the money", "Morgan Housel", "a222", 50, 12, reviews1);
        Book book2 = new Book("Never Split The Difference", "Christopher Voss", "5521d",45,40, reviews1);
        Book book3 = new Book("Atomic Habits", "James Clear", "e2355", 67, 122, reviews2);
        Book book4 = new Book("Onyx Storm", "Rebecca Yarros", "p6654", 134, 84, reviews3);
        Book book5 = new Book("The body keeps the score", "Bessel Van Der Kolk", "c2356", 23, 122, reviews5);
        System.out.println(book1.toString());
        System.out.println("Book 1 Average Rating: " + book1.getAverageRating());
        System.out.println(book1.getStock());
        book1.addReview(new Review("Saleh", 1, "Worst Book in the world"));
        book2.setReview(reviews2);
        System.out.println(book1.getReview());
        System.out.println(book1.getAverageRating());
        System.out.println("Book 1 Author: " + book1.getAuteur());


        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        System.out.println("------------------------------------------------------------------------------------------------------------------");


        Movie movie1 = new Movie("Django", "Quentin Tarantino", "8732i", 60, 230);
        Movie movie2 = new Movie("The Bright Knight", "Christopher Nolan", "1234h", 80, 220);
        Movie movie3 = new Movie("Fury", "David Ayer", "4554Q", 63, 238 );
        Movie movie4 = new Movie("American Psycho", "Mary Harron", "5593p", 180, 140);
        Movie movie5 = new Movie("Interstellar","Christopher Nolan", "6543n", 199, 188);
        System.out.println(movie2.getMediaType());
        movie1.setTitle("The Dark Knight");
        movie1.setAuteur("Mary Harron");
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);
        movies.add(movie5);
        System.out.println("Recommended Movies are: " + movie2.recommendSimilarMovies(movies));
        System.out.println("Movie 1 type: " + movie1.getMediaType());
        System.out.println("Movie 1 duration: " + movie1.getDuration());
        System.out.println("Movie 1 Director: " + movie1.getAuteur());
        System.out.println("All Movies: ");
        for(Movie m : movies) {
            System.out.println(m);
        }

        System.out.println("---------------------------------------------------------------------------------------------------------");

        Music music1 = new Music("Blinding Lights", "The Weeknd", "1344f",23,"The Weeknd");
        Music music2 = new Music("Blood On The Tracks", "Bob Dylan", "1347f",44,"Bob Dylan");
        Music music3 = new Music("Changes", "Tupac", "4433c", 43,"Tupac");
        Music music4 = new Music("So Many Tears", "Tupac", "3321j", 55, "Tupac");
        Music music5 = new Music("Starboy", "The Weeknd", "8830l", 44, "The Weeknd");


        System.out.println("Music 1 Artist: " + music1.getArtist());
        System.out.println(music1.getMediaType());
        ArrayList<Music> musics = new ArrayList<>();
        musics.add(music1);
        musics.add(music2);
        musics.add(music3);
        musics.add(music4);
        musics.add(music5);
        System.out.println("Similar music to music 2: " + music2.generatePlayList(musics));

        System.out.println("All Musics: ");
        for(Music m : musics) {
            System.out.println(m);
        }

        System.out.println("-------------------------------------------------------------------------------------------------------------");

        Novel novel1 = new Novel("To Kill a Mockingbird", "Harper Lee", "4322x", 55, 789, reviews5, "Thriller");
        Novel novel2 = new Novel("The Great Gatsby", " F. Scott Fitzgerald", "1143z", 66, 133, reviews3,"Tragedy");
        Novel novel3 = new Novel("Catch-22", "Joseph Heller", "4431k", 12, 89, reviews2, "Thriller");
        Novel novel4 = new Novel("Don Quixote", "Harper Lee","8839h", 33, 111, reviews1, "Comedy" );

        System.out.println("Novel1 Author: " + novel1.getAuteur());
        System.out.println("Novel1 Genre: " + novel1.getGenre());
        System.out.println("Novel1 Type: " + novel1.getMediaType());

        System.out.println("Novel 1 Average Rating: " + novel1.getAverageRating());

        ArrayList<Novel> novels = new ArrayList<>();
        novels.add(novel1);
        novels.add(novel2);
        novels.add(novel3);
        novels.add(novel4);

        System.out.println("All Novels: ");
        for(Novel n : novels) {
            System.out.println(n);
        }

        System.out.println("----------------------------------------------------------------------------------------------");

        AcademicBook academicBook1 = new AcademicBook("Principles of Economics", "Thomas S. Kuhn", "9219o", 146, 14, reviews5, "Economics");
        AcademicBook academicBook2 = new AcademicBook("A Brief History of Time", "Stephen Hawking", "6643c", 433, 9, reviews4, "Physics");
        AcademicBook academicBook3 = new AcademicBook("The Communist Manifesto", "Friedrich Engels", "6323c", 780, 3, reviews2, "Political");
        AcademicBook academicBook4 = new AcademicBook("The Wealth of Nations", "Adam Smith", "2244l", 220, 55, reviews3, "Economics");

        System.out.println("Academic Book1 subject: " + academicBook1.getSubject());
        System.out.println("Academic book1 Average Rating: " + academicBook1.getAverageRating());
        System.out.println("Academic book1 type: " + academicBook1.getMediaType());

        ArrayList<AcademicBook> academicBooks = new ArrayList<>();
        academicBooks.add(academicBook1);
        academicBooks.add(academicBook2);
        academicBooks.add(academicBook3);
        academicBooks.add(academicBook4);

        System.out.println("All Academic Books: ");
        for(AcademicBook ab : academicBooks) {
            System.out.println(ab);
        }
        System.out.println("-------------------------------------------------------------------------------------------------");

        ArrayList<Media> purchased1 = new ArrayList<>();
        purchased1.add(book1);
        purchased1.add(book2);
        purchased1.add(movie1);
        purchased1.add(movie3);
        purchased1.add(music1);
        purchased1.add(music2);

        ArrayList<Media> shopping1 = new ArrayList<>();
        shopping1.add(music4);
        shopping1.add(movie5);
        shopping1.add(book4);
        shopping1.add(novel3);
        shopping1.add(academicBook2);

        ArrayList<Media> purchased2 = new ArrayList<>();
       purchased2.add(movie5);
       purchased2.add(novel2);
       purchased2.add(academicBook4);
       purchased2.add(book5);

        ArrayList<Media> shopping2 = new ArrayList<>();
        shopping2.add(music1);
        shopping2.add(movie3);
        shopping2.add(book4);
        shopping2.add(novel1);
        shopping2.add(academicBook2);

        User user1 = new User("Khaled", "khaled@gmail.com", purchased1, shopping1);
        User user2 = new User("Ahmed", "ahmed@gmail.com", purchased2, shopping2);
        System.out.println("User 1 purchased medias: " + user1.getPurchaseMediaList());
        System.out.println("User 1 shopping cart: " + user1.getShoppingCart());
        user1.removeFromCart(music4);
        System.out.println("user 1 shopping cart after removing a music: " + user1.getShoppingCart());

        user1.addToCart(new Movie("The Hateful Eight" , "Quentin Tarantino","44343d", 70, 200));
        System.out.println("Shopping cart after adding new movie: " + user1.getShoppingCart());
        user1.checkOut();
        System.out.println("User 1 shopping cart after checking out: " + user1.getShoppingCart());
        System.out.println("User 1 purchased medias after checking out: " + user1.getPurchaseMediaList() );

        System.out.println("-------------------------------------------------------------------------------------");

        ArrayList<User> usersList = new ArrayList<>();
        usersList.add(new User("Mohammed", "Mohammed@gamil.com",purchased1, shopping1));
        usersList.add(user1);
        usersList.add(user2);
        ArrayList<Media> mediaList = new ArrayList<>();
        mediaList.addAll(books);
        mediaList.addAll(movies);
        mediaList.addAll(musics);
        mediaList.addAll(novels);
        mediaList.addAll(academicBooks);


        Store store = new Store(usersList, mediaList);
        System.out.println("All Medias in the store: " +store.displayMedia());
        System.out.println("All users: " + store.displayUsers());
        store.searchBook("my book");



    }
}